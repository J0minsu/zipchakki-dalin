package me.msjo.land.async;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompletableFutureComposeTest {

    @Test
    //두 작업이 이어서 실행되도록 조합하고, 앞선 작업의 결과를 받아 사용 가능 인자타입(동기) :: Function
    void thenCompose() throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });

        // Future 간에 연관 관계가 있는 경우
        CompletableFuture<String> future = hello.thenCompose(this::mangKyu);
        System.out.println(future.get());
    }

    private CompletableFuture<String> mangKyu(String message) {
        return CompletableFuture.supplyAsync(() -> {
            return message + " " + "MangKyu";
        });
    }

    @Test
    //두 작업이 독립적으로 실행(비동기) 후 전부 완수 시 콜백 :: Function
    void thenCombine() throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello";
        });

        CompletableFuture<String> mangKyu = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "MangKyu";
        });

        CompletableFuture<String> future = hello.thenCombine(mangKyu, (h, w) -> h + " " + w);
        System.out.println(future.get());
    }

    @Test
    //여러 작업 동시(스레드 풀 ) 실행하고, 모두 수행 완료 시 콜백 실행
    void allOf() throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });

        CompletableFuture<String> mangKyu = CompletableFuture.supplyAsync(() -> {
            return "MangKyu";
        });

        List<CompletableFuture<String>> futures = Lists.newArrayList(hello, mangKyu);

        IntStream.range(1, 100).forEach(i -> {
            futures.add(CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return String.valueOf(i);
            }));
        });

        CompletableFuture<List<String>> result = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
                .thenApply(v -> futures.stream().
                        map(CompletableFuture::join).
                        collect(Collectors.toList()));

        List<String> stringList = result.get();
        stringList.forEach(System.out::println);

    }

    @Test
    //여러 작업 동시(스레드 풀 ) 실행하고, 가장 빠른 처리 하나에 대한 콜백처리
    void anyOf() throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "Hello";
        });

        CompletableFuture<String> mangKyu = CompletableFuture.supplyAsync(() -> {
            return "MangKyu";
        });

        CompletableFuture<Void> future = CompletableFuture.anyOf(hello, mangKyu).thenAccept(System.out::println);
        future.get();
    }

}
