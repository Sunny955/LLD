package org.lld_practice.builderpattern;

public class MainRunner {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new EngineeringStudentBuilder();
        Student st = studentBuilder
                .setName("Amiya")
                .setSubjects()
                .setRollNumber(10)
                .setAge(20).build();

        System.out.println(st);
    }
}
