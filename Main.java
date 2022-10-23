import model.Student;
import model.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        studentService.nhap(sc);
    }
}