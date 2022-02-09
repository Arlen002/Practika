package com.company;

public class Student extends Person{
    private String faculty;
    private int allPoints;
    private Task [] tasks;

    public Student(String name, String status, int age, String faculty) {
        super(name, status, age);
        this.faculty = faculty;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(int allPoints) {
        this.allPoints = allPoints;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
    void studentinfo(){
        System.out.println("Жалпы бал: "+getAllPoints());
    }
    @Override
    public String toString(){
        return super.toString()+ "  "+ getFaculty()+"  "+getAllPoints();
    }
}
