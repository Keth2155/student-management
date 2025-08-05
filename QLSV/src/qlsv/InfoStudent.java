/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

/**
 *
 * @author adm
 */
public class InfoStudent extends Student implements IStudent {


    private double gpa;

    public InfoStudent() {
        super();
    }

    public InfoStudent(int gpa, String name, int age, int msv) {
        super(name, age, msv);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    @Override
    public void ShowInfo() {
        System.out.println("THONG TIN SINH VIEN");
        System.out.println("Ho ten: " +getName());
        System.out.println("Ma sinh vien: " +getMsv());
        System.out.println("Sinh vien nam: " +getAge());
        System.out.println("GPA: " + gpa);
}
}
