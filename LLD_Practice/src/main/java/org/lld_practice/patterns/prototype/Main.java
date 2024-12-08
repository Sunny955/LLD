package org.lld_practice.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(19,"Tony","XYZ","10th");

        Student cloneObj = (Student) st.clone();

        System.out.println(cloneObj);
    }
}
