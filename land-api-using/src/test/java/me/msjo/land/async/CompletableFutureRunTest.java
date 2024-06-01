package me.msjo.land.async;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CompletableFutureRunTest {

    @Test
    // 반환 값이 없는 Void Type
    public void runAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        future.get();
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

    @Test
    void supplyAsync() throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Thread: " + Thread.currentThread().getName();
        });

        System.out.println(future.get());
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

    @Test
    void supplyAsyncAnotherThreadPool() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Thread: " + Thread.currentThread().getName();
        }, executorService);

        System.out.println(future.get());
        System.out.println("Thread: " + Thread.currentThread().getName());

        executorService.shutdown();
    }

}
