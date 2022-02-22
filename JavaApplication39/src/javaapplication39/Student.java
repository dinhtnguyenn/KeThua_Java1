/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author DinhNguyen
 */
public class Student extends Person {

    private String masv;
    private double diemTB;
    private String email;

    public Student() {
    }

    public Student(String masv, double diemTB, String email, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.masv = masv;
        this.diemTB = diemTB;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mssv: ");
        masv = s.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        diemTB = s.nextDouble();
        s.nextLine();
        System.out.println("Nhập email: ");
        email = s.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" - " + masv + " - " + diemTB + " - " + email);
        System.out.println("\n");
    }
    
    public boolean checkHocBong(){
        if(diemTB > 8.0){
            return true;
        }else{
            return false;
        }
    }

}
