package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new IUStudent("Татьяна","Сабаева","Забыл", 1, 100, true);
        student1.writeExam();
        Student student2 = new MathStudent("Олег","Сабаева","Забыл", 1, 100, false);
        student2.writeExam();
    }
}

