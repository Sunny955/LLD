package org.lld_practice.LRUCache;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUMain {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node head;
    private final Node tail;

    public LRUMain(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int val) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            moveToHead(node);
            return;
        }

        if(cache.size() == capacity) {
            removeTail();
        }

        Node newNode = new Node(key,val);
        cache.put(key,newNode);
        addToHead(newNode);
    }
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void removeTail() {
        Node prevLast = tail.prev;
        removeNode(prevLast);
        cache.remove(prevLast.key);
    }
    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void display() {
        Node curr = head.next;
        while(curr!=tail) {
            System.out.println("( "+curr.key+" "+curr.value+" )");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUMain lruCache = new LRUMain(10);

        System.out.println("Cache elements now -------");
        lruCache.display();

        System.out.println("Adding and modifying some elements");
        lruCache.put(12,38);
        lruCache.put(19,39);
        lruCache.put(22,10);

        lruCache.display();

        System.out.println(lruCache.get(12));
        System.out.println(lruCache.get(100));
        System.out.println(lruCache.get(22));

        lruCache.display();
    }
}
