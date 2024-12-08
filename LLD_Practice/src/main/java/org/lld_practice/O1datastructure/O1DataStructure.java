package org.lld_practice.O1datastructure;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class O1DataStructure {
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public O1DataStructure() {
        this.map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public void insert(int key, int value) {
        map.remove(key);
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        addToHead(newNode);
    }

    public void delete(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            map.remove(key);
        }
    }

    public int search(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            return node.value;
        }
        return -1;
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void print() {
        Node curr = head.next;
        while (curr != tail) {
            System.out.print("( " + curr.key + " " + curr.value + " )");
            curr = curr.next;
        }
        System.out.println();
    }
}
