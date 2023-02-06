package ProjectStudentTeacher;

import java.util.ArrayList;

public class Data {
    ArrayList<Student> student = new ArrayList();
    ArrayList<Teacher> teachers = new ArrayList();

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teachers = teacher;
    }

    public void addStudent(Student students){
        student.add(students);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void viewTeacher(){
        for(Teacher teacher : teachers) {
            System.out.println(teacher.getName());
            System.out.println(teacher.getUsername());
        }
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

}
