package ra.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Nguyen Van A", 9.5));
        list.add(new Student(2,"Nguyen Van B",10));
        list.add(new Student(3,"Do Van B",6));

        // tim kiem sinh vien theo ma sinh vien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ma sinh vien can tim ");
        int code = Integer.parseInt(scanner.nextLine());

        boolean check = false;
        for (Student student : list) {
            if(student.getStudentCode() == code){
                System.out.println(student.getStudentName());
                check = true;
            }
        }
        if(!check){
            System.out.println("Khong co sinh vien nao");
        }
    }
}
