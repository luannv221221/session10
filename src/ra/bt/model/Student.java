package ra.bt.model;

import java.util.Scanner;

public class Student implements IStudent{
    private String studentCode;
    private String studentName;
    private float markAVG;

    public Student() {
    }

    public Student(String studentCode, String studentName, float markAVG) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.markAVG = markAVG;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMarkAVG() {
        return markAVG;
    }

    public void setMarkAVG(float markAVG) {
        this.markAVG = markAVG;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien ");
        studentCode = scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien");
        studentName = scanner.nextLine();
        System.out.println("Nhap vao diem TB");
        markAVG = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", studentName='" + studentName + '\'' +
                ", markAVG=" + markAVG +
                '}';
    }
}
