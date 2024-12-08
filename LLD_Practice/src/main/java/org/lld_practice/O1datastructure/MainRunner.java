package org.lld_practice.O1datastructure;

public class MainRunner {
    public static void main(String[] args) {
        O1DataStructure ds = new O1DataStructure();

        ds.insert(1,100);
        ds.insert(2,200);
        ds.insert(3,300);

        ds.print();

        ds.delete(3);

        ds.print();

        System.out.println(ds.search(2));
    }
}
