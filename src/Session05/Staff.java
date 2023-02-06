package Session05;

public class Staff extends Users {
    protected RoleStaff role = RoleStaff.Supervisor; // private karena tidak mau diturunkan lagi
    protected int salary;

    public Staff(String name, String password, String email, RoleStaff role) {
        super(name, password, email);
        this.role = role;
    }
}
