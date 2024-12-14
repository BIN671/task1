package org.example;

abstract public class Student {
    private String name;
    private String second_name;
    private String third_name;
    private int course;
    private int grade;

    public Student(String name, String second_name, String third_name, int course, int grade){
        this.name = name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.grade = grade;
        this.course = course;
    }

    abstract void writeExam();
}




