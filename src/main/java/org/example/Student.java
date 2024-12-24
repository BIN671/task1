package org.example;

abstract public class Student {
    protected String name;
    protected String second_name;
    protected String third_name;
    protected int course;
    protected int grade;

    public Student(String name, String second_name, String third_name, int course, int grade){
        this.name = name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.grade = grade;
        this.course = course;
    }

    abstract void writeExam();
}




