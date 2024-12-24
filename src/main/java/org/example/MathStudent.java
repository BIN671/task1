package org.example;

public class MathStudent extends Student {
    private Boolean write;

    public MathStudent(String name, String second_name, String third_name, int course, int grade, Boolean write){
        super(name, second_name, third_name, course, grade);
        this.write = write;
    }


    @Override
    public void writeExam(){
        System.out.println("ФН пишет жкзамен - " + write);
    }
}

