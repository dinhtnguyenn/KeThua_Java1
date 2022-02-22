/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DinhNguyen
 */
public class StudentTest {

    ArrayList<Student> listSV = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("\n------\n");
            System.out.println("1. Nhập danh sách từ bàn phím");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. SV điểm trung bình cao nhất và thấp nhất");
            System.out.println("4. Tìm sv theo mã");
            System.out.println("5. Sắp xếp tên theo  a-> z");
            System.out.println("6. Hiển thị sính viên nhận được học bổng và xếp theo điểm từ cao xuống thấp");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = s.nextInt();

            switch (chon) {
                case 1:
                    NhapDanhSach();
                    break;
                case 2:
                    if (listSV.size() == 0) {
                        System.out.println("Bạn phải lựa chọn chức năng 1 để nhập ds trước");
                        NhapDanhSach();
                    }
                    XuatDanhSach();
                    break;
                case 3:
                    if (listSV.size() == 0) {
                        System.out.println("Bạn phải lựa chọn chức năng 1 để nhập ds trước");
                        NhapDanhSach();
                    }
                    XuatSVDTBMaxMin();
                    break;
                case 4:
                    if (listSV.size() == 0) {
                        System.out.println("Bạn phải lựa chọn chức năng 1 để nhập ds trước");
                        NhapDanhSach();
                    }
                    TimSV();
                    break;
                case 5:
                    if (listSV.size() == 0) {
                        System.out.println("Bạn phải lựa chọn chức năng 1 để nhập ds trước");
                        NhapDanhSach();
                    }
                    SapXep();
                    break;
                case 6:
                    if (listSV.size() == 0) {
                        System.out.println("Bạn phải lựa chọn chức năng 1 để nhập ds trước");
                        NhapDanhSach();
                    }
                    NhanHocBong();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public void NhapDanhSach() {
        do {
            Student st = new Student();
            st.inputInfo();
            listSV.add(st);

            System.out.println("Nhấn 0 để thoát, nhấn số bất kỳ để tiếp tục");
            int check = s.nextInt();

            if (check == 0) {
                break;
            }
        } while (true);
    }

    public void XuatDanhSach() {
        for (Student st : listSV) {
            st.showInfo();
        }
    }

    public void XuatSVDTBMaxMin() {
        //sv1 8.5
        //sv2 9
        //sv3 7
        //sv4 10
        //sv5 10
        double max = listSV.get(0).getDiemTB(); //max = 8.5
        for (Student st : listSV) {
            max = Math.max(max, st.getDiemTB());//Math.max -> 10 => max = 10
        }

//        for(Student st : listSV){
//            if(st.getDiemTB() > max){
//                max = st.getDiemTB();
//            }
//        }
        for (Student st : listSV) {
            if (st.getDiemTB() == max) {
                st.showInfo();
            }
        }
    }

    public void TimSV() {
        System.out.println("Nhập mã sv cần tìm: ");
        String ma = s.nextLine();
        boolean flag = false;
        for (Student st : listSV) {
            if (st.getMasv().equalsIgnoreCase(ma)) {
                flag = true;
                st.showInfo();
                break;
            }
        }

        if (flag == false) {
            System.out.println("Không tìm thấy sv");
        }
    }

    public void SapXep() {
        Collections.sort(listSV, (sv1, sv2) -> (int) (sv1.getTen().compareTo(sv2.getTen())));
    }

    public void NhanHocBong() {
        ArrayList<Student> listNHB = new ArrayList<>();
        for(Student st : listSV){
            if(st.checkHocBong() == true){
                listNHB.add(st);
            }
        }
        
        Collections.sort(listNHB, (sv1, sv2) -> (int) (sv1.getDiemTB() - sv2.getDiemTB()));
    }
}
