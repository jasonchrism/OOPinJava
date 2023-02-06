package ProjectStudentTeacher;

import javax.swing.tree.ExpandVetoException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

     public void login(Scanner scan, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        int input;
        int check = 0;
        scan = new Scanner(System.in);
        do {
            try {
                System.out.println("L\n" +
                        "██╗░░░░░███████╗░█████╗░██████╗░███╗░░██╗██╗███╗░░██╗░██████╗░\n" +
                        "██║░░░░░██╔════╝██╔══██╗██╔══██╗████╗░██║██║████╗░██║██╔════╝░\n" +
                        "██║░░░░░█████╗░░███████║██████╔╝██╔██╗██║██║██╔██╗██║██║░░██╗░\n" +
                        "██║░░░░░██╔══╝░░██╔══██║██╔══██╗██║╚████║██║██║╚████║██║░░╚██╗\n" +
                        "███████╗███████╗██║░░██║██║░░██║██║░╚███║██║██║░╚███║╚██████╔╝\n" +
                        "╚══════╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚══╝░╚═════╝░\n" +
                        "\n" +
                        "███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███████╗███╗░░░███╗███████╗███╗░░██╗████████╗\n" +
                        "████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░██╔════╝████╗░████║██╔════╝████╗░██║╚══██╔══╝\n" +
                        "██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░█████╗░░██╔████╔██║█████╗░░██╔██╗██║░░░██║░░░\n" +
                        "██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██╔══╝░░██║╚██╔╝██║██╔══╝░░██║╚████║░░░██║░░░\n" +
                        "██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝███████╗██║░╚═╝░██║███████╗██║░╚███║░░░██║░░░\n" +
                        "╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░\n" +
                        "\n" +
                        "░██████╗██╗░░░██╗░██████╗████████╗███████╗███╗░░░███╗\n" +
                        "██╔════╝╚██╗░██╔╝██╔════╝╚══██╔══╝██╔════╝████╗░████║\n" +
                        "╚█████╗░░╚████╔╝░╚█████╗░░░░██║░░░█████╗░░██╔████╔██║\n" +
                        "░╚═══██╗░░╚██╔╝░░░╚═══██╗░░░██║░░░██╔══╝░░██║╚██╔╝██║\n" +
                        "██████╔╝░░░██║░░░██████╔╝░░░██║░░░███████╗██║░╚═╝░██║\n" +
                        "╚═════╝░░░░╚═╝░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝");
                System.out.println("=========================================");
                System.out.println("|           SEKOLAH ITU ASIK            |");
                System.out.println("=========================================");
                System.out.println("| Choose Your Login :                   |");
                System.out.println("| 1. Login as Teacher                   |");
                System.out.println("| 2. Login as Student                   |");
                System.out.println("| 0. Exit                               |");
                System.out.println("=========================================");
                input = scan.nextInt();
                scan.nextLine();
                if (input == 1){
                    loginAsTeacher(scan, teache, studen, data);
                } else if (input == 2){
                    loginAsStudent(scan, teache, studen, data);
                } else if (input == 0){
                    check = 0;
                }
            } catch (Exception e){
                System.out.println();
                System.out.println("Please Input Number Only1");
                System.out.println("Press enter to Continue...");
                scan.nextLine();
                scan.nextLine();
                login(scan, teache, studen, data);
            }
        } while (check != 0);
    }
    Data datas = new Data();
    TeacherMenu teachermenu = new TeacherMenu();
    StudentMenu studentMenu = new StudentMenu();
    private String inputUsernameTeacher;
    private String inputPasswordTeacher;
    private String inputUsername;
    private String inputPassword;
    private int check = 0;
    int idx;
    void loginAsTeacher(Scanner scan, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        do {
            System.out.print("Input Username : ");
            inputUsernameTeacher = scan.nextLine();
            System.out.print("Input Password : ");
            inputPasswordTeacher = scan.nextLine();
            for (Teacher tempData : teache){
                if (tempData.getUsername().equals(inputUsernameTeacher) && tempData.getPassword().equals(inputPasswordTeacher)){
                    idx = teache.indexOf(tempData);
                    check = 1;
                    teachermenu.teachMenu(scan, idx, teache, data, studen);
                    break;
                }
                System.out.println("Wrong Username or Password!");
            }
        } while (check != 1);
    }

    void loginAsStudent(Scanner scan, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        do {
            System.out.print("Input Username : ");
            inputUsername = scan.nextLine();
            System.out.print("Input Password : ");
            inputPassword = scan.nextLine();
            for (Student tempdata : studen){
                if (tempdata.getUsername().equals(inputUsername) && tempdata.getPassword().equals(inputPassword)){
                    idx = studen.indexOf(tempdata);
                    check = 1;
                    studentMenu.studmenu(scan, idx, teache, studen, data);
                    break;
                }
            }
            System.out.println("Wrong Username or Password!");
        } while (check != 1);
    }
}
