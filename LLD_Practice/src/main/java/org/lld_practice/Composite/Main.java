package org.lld_practice.Composite;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movie");
        FileSystem file = new File("Study Material");
        directory.add(file);

        Directory newDirectory = new Directory("Suspense");
        File air20 = new File("Air20");

        newDirectory.add(air20);
        directory.add(newDirectory);


        directory.ls();
    }
}
