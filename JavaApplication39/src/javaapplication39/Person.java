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
public class Person {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void inputInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập ten: ");
        ten = s.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = s.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = s.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = s.nextLine();
    }
    
    public void showInfo(){
        System.out.print(ten + " - " + gioiTinh +" - " + ngaySinh + " - " + diaChi);
    }
}
