package ProjectStudentTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    ArrayList<Subject> subjects = new ArrayList();
    ArrayList<Math> math = new ArrayList<>();
    ArrayList<Science> science = new ArrayList();
    ArrayList<Social> social = new ArrayList();
    private String name;
    Student(String username, String password, String name){
        super(username, password);
        this.name = name;
    }
    public ArrayList<Math> getMath() {
        return math;
    }

    public void setMath(ArrayList<Math> math) {
        this.math = math;
    }

    public ArrayList<Science> getScience() {
        return science;
    }

    public void setScience(ArrayList<Science> science) {
        this.science = science;
    }

    public ArrayList<Social> getSocial() {
        return social;
    }

    public void setSocial(ArrayList<Social> social) {
        this.social = social;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void displayHi(){
        System.out.println("Hi Good Boy! Good Luck!");
    }

}
