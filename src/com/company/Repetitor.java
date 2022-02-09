package com.company;

import java.util.Scanner;

public class Repetitor extends Person{
    public Repetitor(String name, String status, int age) {
        super(name, status, age);
    }

    void sumMethed(Task task, Student student) {
        Scanner sc = new Scanner(System.in);
        if (task.isDone() == true) {
            System.out.println("Тапшырмага бал бериниз: ");
            int point = sc.nextInt();
            task.setPointForlt(point);
            task.setChecked(true);
            switch (point) {
                case 2:
                    System.out.println("ото жаман");
                    break;
                case 3:
                    System.out.println("жаман");
                    break;
                case 4:
                    System.out.println("хорошо");
                    break;
                case 5:
                    System.out.println("Отлично");
                    break;
            }
            int sum = student.getAllPoints();
            sum += point;
            student.setAllPoints(sum);
        } else {
            System.out.println("buto elek: ");
        }
    }
}
