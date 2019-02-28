package com.org;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("HI-->");
        Runnable r1 = () -> System.out.println("HI-->");
        Runnable r2 = () -> System.out.println("HI-->");
        Runnable r3 = () -> System.out.println("HI-->");
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(r);
        service.submit(r1);
        service.submit(r2);
        service.submit(r3);
        if (service instanceof ThreadPoolExecutor) {
            System.out.println("Active Count==>" + ((ThreadPoolExecutor) service).getActiveCount());
            System.out.println("Core pool size==>" + ((ThreadPoolExecutor) service).getCorePoolSize());
            System.out.println("Max pool size==>" + ((ThreadPoolExecutor) service).getMaximumPoolSize());

        }

        // Callable<Object> c = Executors.callable(r);
    }

}
