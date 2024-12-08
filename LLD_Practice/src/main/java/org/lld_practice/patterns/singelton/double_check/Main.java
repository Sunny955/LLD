package org.lld_practice.patterns.singelton.double_check;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        DBConnection obj = DBConnection.getInstance();
    }
}
