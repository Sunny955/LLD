package org.lld_practice.browser;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    private static class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
        }
    }

    private Node curr;
    private static final List<Node> listOfTabs = new ArrayList<>();
    public Browser(String url) {
        this.curr = new Node(url);
        curr.next = null;
        curr.prev = null;
    }

    public void navigate(String url) {
        Node newNode = new Node(url);
        listOfTabs.add(newNode);
        newNode.prev = curr;
        curr.next = newNode;
        curr = newNode;
        System.out.println("Navigated to: "+curr.url);
    }

    public void forward() {
        if(curr.next != null) {
            curr = curr.next;
            System.out.println("Went forward to: "+curr.url);
        }
        else {
            System.out.println("No forward tab is available!");
        }
    }

    public void backward() {
        if(curr.prev != null) {
            curr = curr.prev;
            System.out.println("Went back to: "+curr.url);
        }
        else {
            System.out.println("Can't go back!");
        }
    }

    public static void allTabs() {
        int indx = 1;
        for(Node n: listOfTabs) {
            System.out.println("Tab "+indx+n.toString());
            indx++;
        }
    }
}
