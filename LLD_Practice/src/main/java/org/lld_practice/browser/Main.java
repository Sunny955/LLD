package org.lld_practice.browser;

public class Main {
    public static void main(String[] args) {
        Browser tab1 = new Browser("google.com");
        tab1.navigate("www.youtube.com");
        tab1.navigate("www.yahoo.com");

        tab1.backward();
        tab1.forward();

        Browser tab2 = new Browser("www.pornhub.com");
        tab2.navigate("www.delli.com");

        tab2.forward();
        tab2.backward();
        tab2.forward();

        Browser.allTabs();

    }
}
