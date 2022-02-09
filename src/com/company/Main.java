package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student("Арлен"," online ",20,"OshMU");
        System.out.println(st);

        Task task = new Task("Arlen", true,st);
        Task task2 = new Task("Alibek", true,st);
        Repetitor rep = new Repetitor("Алтынбек "," online ",25);
        System.out.println(rep);

        rep.sumMethed(task,st);
        rep.sumMethed(task2,st);
        task.taskinfo();
        task2.taskinfo();
        st.studentinfo();
    }
}
