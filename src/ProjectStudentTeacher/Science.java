package ProjectStudentTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Science extends Subject{
    double finalScore;
    public Science(int asgScore1, int asgScore2, int asgScore3, int examScore1, int examScore2, double finalScore) {
        super(asgScore1, asgScore2, asgScore3, examScore1, examScore2);
        this.finalScore = finalScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public void display(Scanner scan, int idx, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        System.out.println("============================");
        System.out.println("Assignment 1 : " + getAsgScore1());
        System.out.println("Assignment 2 : " + getAsgScore2());
        System.out.println("Assignment 3 : " + getAsgScore3());
        System.out.println("Exam 1 : " + getExamScore1());
        System.out.println("Exam 2 : " + getExamScore2());
        System.out.println("| Final Score : " + getFinalScore());
        System.out.println("============================");
        System.out.println();
        System.out.println("Press Enter to Continue....");
        scan.nextLine();
        new StudentMenu().viewSubject(scan, idx, teache, studen, data);
    }
}
