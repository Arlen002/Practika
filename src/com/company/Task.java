package com.company;

public class Task {
    private String name;
    private int pointForlt;
    private boolean  done;
    private boolean checked;
    private Student student;

    public Task(String name,boolean done,Student student){
        this.name = name;
        this.student = student;
        this.done = done;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointForlt() {
        return pointForlt;
    }

    public void setPointForlt(int pointForlt) {
        this.pointForlt = pointForlt;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    void taskinfo(){
        System.out.println(getName()+" "+getPointForlt()+" "+isDone());
    }
}
