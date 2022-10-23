package model;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    static ArrayList<Student> lists= new ArrayList<>();
    public void nhap(Scanner sc){
        while (true) {
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập Địa Chỉ: ");
            String address = sc.nextLine();
            System.out.println("Có nhập vào nữa không");
            System.out.println("1. Ấn 1 nếu có");
            System.out.println("0. Ấn 0 nếu không");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1:
                    break;
                case 0:
                    System.out.println("Dừng Chương Trình");
                    System.exit(0);
            }
            Student student = new Student(name, address);
            lists.add(student);
        }
    }

}
