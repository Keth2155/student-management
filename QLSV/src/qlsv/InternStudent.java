/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

/**
 *
 * @author adm
 */
public class InternStudent extends Student implements IStudent{
    
    private String companyName;
    private String vitri;

    public InternStudent() {
        super();
    }

    public InternStudent(String companyName, String vitri, String name, int age, int msv) {
        super(name, age, msv);
        this.companyName = companyName;
        this.vitri = vitri;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    
    @Override
    public void ShowInfo() {
        System.out.println("Sinh vien thuc tap:");
        System.out.println("Ho ten: "+getName());
        System.out.println("Sinh vien nam: "+getAge());
        System.out.println("Cong ty: " +companyName);
        System.out.println("Vi tri: " +vitri);
}
}