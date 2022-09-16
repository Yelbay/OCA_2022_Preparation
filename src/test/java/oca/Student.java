package oca;

import java.util.Scanner;

public class Student {
    String studentName;
    String year="2020";
    static int counter=1000;
    String studentId;

public Student(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name");
    studentName= scan.next();
    setStudentId();


}

    public static void main(String[] args) {
        Student std1=new Student();
        System.out.println(std1.studentName+std1.studentId);
        Student std2=new Student();
        System.out.println(std2.studentName+std2.studentId);
        Student std3=new Student();
        System.out.println(std3.studentName+std3.studentId);

    }

    public void setStudentId() {
        counter++;
       this.studentId=year+""+counter;

    }
}
