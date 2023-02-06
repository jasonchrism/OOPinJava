package Session05;

public class Inheritance {
    public static void main(String[] args) {
        Staff budi = new Staff("Budi", "Budi123", "budi@gmail.com", RoleStaff.Manager);
        budi.name = "Budi";
        budi.password = "Budi123";
        budi.email = "budi@gmail.com";
        budi.role = RoleStaff.Manager;
        budi.salary = 20000000;
        boolean result = budi.login("budi@gmail.com", "Budi123");
        if (result){
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
    }
}

class Users {
    protected String name;
    protected String password; // protected krna mau diturunkan (inheritance)
    protected String email;
    protected String Dob;

    public Users(String name, String password, String email) { // constructor harus isinya apa yang dibutuhkan saja atau wajib)
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public boolean login(String email, String password){
        if(this.email.equals(email) && this.password.equals(password)){
            return true;
        } else {
            return false;
        }
    }
}

class Customer extends Users {
    private int point;
    private String membership;
    public Customer(String name, String password, String email){
        super(name, password, email);
    }
}
