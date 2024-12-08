package org.lld_practice.proxy;

public class Main {
    public static void main(String[] args) {
        Internet it = new InternetProxy();

        try {
            it.connectTo("abc.com");
            it.connectTo("xyz.com");
        } catch (Exception e) {
            System.out.println("Exception caught, "+e.getMessage());
        }
    }
}
