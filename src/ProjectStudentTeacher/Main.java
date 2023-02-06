package ProjectStudentTeacher;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data data = new Data();
        Login login = new Login();
        Student s1 = new Student("Jasoncm", "Jasoncm", "Jason Chrisbellno");
        Student s2 = new Student("SatmikaOzora", "SatmikaOzora", "Satmika Antargata");
        Student s3 = new Student("Bintang", "Bintang", "Aryo Bintang");
        Student s4 = new Student("DustinBijou", "DustinBijou", "Dustin Bijou Arasy");
        Student s5 = new Student("AbdhySam", "AbdhySam", "Abdhy Samoedra");
        Student s6 = new Student("JoelEd", "JoelEd", "Joel Edward");
        Student s7 = new Student("DanielSan", "DanielSan", "Daniel Santoso");
        Student s8 = new Student("KeziaTan", "KeziaTan", "Kezia Revalina Tan");
        Student s9 = new Student("Yogakun", "Yogakun", " I Made Yogananda");
        Student s10 = new Student("Angelica", "Angelica", "Angelica Asix");
        Teacher t1 = new Teacher("SocialTeacher", "SocialTeacher", "Indah Permatasai");
        Teacher t2 = new Teacher("ScienceTeacher", "ScienceTeacher", "Agus Hartono");
        Teacher t3 = new Teacher("MathTeacher", "MathTeacher", "Bambang Pamungkas");
        data.addStudent(s1);
        data.addStudent(s2);
        data.addStudent(s3);
        data.addStudent(s4);
        data.addStudent(s5);
        data.addStudent(s6);
        data.addStudent(s7);
        data.addStudent(s8);
        data.addStudent(s9);
        data.addStudent(s10);
        data.addTeacher(t3);
        data.addTeacher(t2);
        data.addTeacher(t1);
        login.login(scan, data.teachers, data.student, data);
    }
}
