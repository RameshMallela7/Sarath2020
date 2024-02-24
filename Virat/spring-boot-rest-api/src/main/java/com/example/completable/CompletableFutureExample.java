package com.example.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> result1 = CompletableFuture.supplyAsync(CompletableFutureExample::executeTask1);
        CompletableFuture<String> future1 = result1.thenApply(String::toUpperCase);

        CompletableFuture<String> result2 = CompletableFuture.supplyAsync(CompletableFutureExample::executeTask2);
        CompletableFuture<String> future2 = result2.thenApply(String::toUpperCase);

        String output = future1.get().concat(" ").concat(future2.get());

        System.out.println(output);


    }

    public static String executeTask1() {
        try {
            Thread.sleep(2000);
            System.out.println("Task1 completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Sarath";
    }

    public static String executeTask2() {
        try {
            System.out.println("Task2 completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "Asha";
    }
}
