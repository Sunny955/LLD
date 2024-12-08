package org.lld_practice.java_practice;

import java.util.HashMap;
import java.util.Map;

class SynchronizedHashMap {
    private final Map<String,Integer> map = new HashMap<>();

    public void put(String key,Integer value) {
        synchronized (map) {
            map.put(key,value);
        }
    }

    public Integer get(String key) {
        synchronized (map) {
            return map.get(key);
        }
    }

    public void remove(String key) {
        synchronized (map) {
            map.remove(key);
        }
    }

    public boolean containsKey(String key) {
        synchronized (map) {
            return map.containsKey(key);
        }
    }
}

public class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedHashMap map = new SynchronizedHashMap();

        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                String key = String.valueOf(i);
                map.put(key,i);
                System.out.println("Thread:1 added: "+key);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                String key = String.valueOf(i);
                Integer value = map.get(key);
                System.out.println("Thread:2 retrived: "+key+" -> "+value);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                String key = String.valueOf(i);
                map.remove(key);
                System.out.println("Thread 3: Removed " + key);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}
