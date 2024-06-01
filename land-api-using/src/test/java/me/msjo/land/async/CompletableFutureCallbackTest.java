package me.msjo.land.async;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCallbackTest {

    @Test
    //반환 값을 받아 가공 후 다른 값 반환 가능
    void thenApply() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Thread: " + Thread.currentThread().getName();
        }).thenApply(s -> {
            return s.toUpperCase();
        });

        System.out.println(future.get());
    }

    @Test
    //반환 값을 받아 처리 후 반환하지 않음
    void thenAccept() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            return "Thread: " + Thread.currentThread().getName();
        }).thenAccept(s -> {
            System.out.println(s.toUpperCase());
        });

        future.get();
    }


    @Test
    void thenRun() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Thread: " + Thread.currentThread().getName();
        }).thenRun(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        });

        future.get();
    }

}