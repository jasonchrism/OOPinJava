package ProjectStudentTeacher;


public class Teacher extends User {
    private String name;
    Teacher(String username, String password, String name){
        super(username, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayHi(){
        System.out.println("Hi Welcome Teacher! Have a Great Day!");
    }
}
