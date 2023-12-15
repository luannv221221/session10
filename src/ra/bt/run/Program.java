package ra.bt.run;

import ra.bt.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("===========MENU=============");
            System.out.println("1.Nhap vao sinh vien");
            System.out.println("2.Hien thi danh sach sinh vien");
            System.out.println("3.Tim kiem sinh vien");
            System.out.println("4.Sap xep sinh vien theo diem tang dan");
            System.out.println("5.Thoat");
            System.out.println("Moi lua chon");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    do {
                        System.out.println("Nhap vao thong tin sinh vien");
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                        System.out.println("Muon them moi sinh vien nua khong 1.Co 2.Khong");
                        int check = Integer.parseInt(scanner.nextLine());
                        if(check == 2){
                            break;
                        }
                    } while (true);

                    break;
                case 2:
                    for (Student student : list) {
                        student.displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ma sinh vien can tim");
                    String code = scanner.nextLine();
                    boolean check = false;
                    for (Student student : list) {
                        if(code.equals(student.getStudentCode())){
                            student.displayData();
                            check = true;
                            break;
                        }
                    }
                    if(!check)
                        System.out.println("Ma sinh vien "+code+" Khong ton tai");
                    break;
                case 4:
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j < list.size() - 1 - i; j++) {
                            if(list.get(j).getMarkAVG() < list.get(j+1).getMarkAVG()){
                               Student studentTemp = list.get(j);
                               list.set(j,list.get(j+1));
                               list.set(j+1,studentTemp);
                            }
                        }
                    }
                    // duyet sau khi da sap xep
                    for (Student student : list) {
                        student.displayData();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Sai lua chon (1-5)");
            }
        }while (true);
    }
}
