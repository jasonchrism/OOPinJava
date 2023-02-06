package ProjectStudentTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
    Scanner scan = new Scanner(System.in);
//    private String subjectName;
    private int asgScore1;
    private int asgScore2;
    private int asgScore3;
    private int examScore1;
    private int examScore2;
    public Subject(int asgScore1, int asgScore2, int asgScore3, int examScore1, int examScore2){
//        this.subjectName = subjectName;
        this.asgScore1 = asgScore1;
        this.asgScore2 = asgScore2;
        this.asgScore3 = asgScore3;
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
    }

//    public String getSubjectName() {
//        return subjectName;
//    }
//
//    public void setSubjectName(String subjectName) {
//        this.subjectName = subjectName;
//    }


    public int getExamScore1() {
        return examScore1;
    }

    public void setExamScore1(int examScore1) {
        this.examScore1 = examScore1;
    }

    public int getExamScore2() {
        return examScore2;
    }

    public void setExamScore2(int examScore2) {
        this.examScore2 = examScore2;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public int getAsgScore1() {
        return asgScore1;
    }

    public void setAsgScore1(int asgScore1) {
        this.asgScore1 = asgScore1;
    }

    public int getAsgScore2() {
        return asgScore2;
    }

    public void setAsgScore2(int asgScore2) {
        this.asgScore2 = asgScore2;
    }

    public int getAsgScore3() {
        return asgScore3;
    }

    public void setAsgScore3(int asgScore3) {
        this.asgScore3 = asgScore3;
    }

    private int input;
    private int check = 0;
    void chooseSubject(Scanner scan , int idx, ArrayList<Student> studen, Subject subject, Data data){
        do {
            System.out.println("Choose Subject : ");
            System.out.println("1. Math");
            System.out.println("2. Science");
            System.out.println("3. Social");
            System.out.println("4. Indonesian");
            System.out.print(">> ");
            input = scan.nextInt();
            if (input == 1){
                System.out.printf("Assignment %d : %d\n");
            }
        } while (check != 1);
    }
}
