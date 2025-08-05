/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

/**
 *
 * @author adm
 */
public abstract  class Student {
    private String name;
    private int age;
    private int msv;

    public Student(){
    
    }
    
    public Student(String name, int age, int msv) {
        this.name = name;
        this.age = age;
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 ){
            this.age=age;
        }
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }
    
    public abstract void ShowInfo();
    
}
