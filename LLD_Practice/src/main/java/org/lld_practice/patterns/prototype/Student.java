package org.lld_practice.patterns.prototype;

public class Student implements Prototype {
    int age;
    String name;
    private String address;
    String standard;

    public Student(int age, String name, String address, String standard) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.standard = standard;
    }

    @Override
    public Prototype clone() {
        return new Student(age,name,address,standard);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }


}
