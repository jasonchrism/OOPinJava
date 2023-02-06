package ProjectStudentTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
    private  int choose;
    private int choose1;

    void studmenu(Scanner scan, int idx, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        do {
            System.out.println("==================================");
            System.out.println("| Choose Activities :            |");
            System.out.println("==================================");
            System.out.println("| 1. View Subject                |");
            System.out.println("| 2. View All Score              |");
            System.out.println("| 0. Back                        |");
            System.out.println("==================================");
            studen.get(idx).displayHi();
            System.out.println("Please Input between 1 - 2 : ");
            try {
                choose = scan.nextInt();
                scan.nextLine();
                if (choose == 1) {
                    viewSubject(scan, idx, teache, studen, data);
                } else if (choose == 2){
                    viewScore(scan, idx, teache, studen, data);
                } else if (choose == 0){
                    new Login().login(scan, teache, studen, data);
                }
            } catch (Exception e){
                System.out.println();
                System.out.println("Please Input Number Only!");
                System.out.println("Press enter to Continue...");
                scan.nextLine();
                scan.nextLine();
                studmenu(scan, idx, teache, studen, data);
            }
        } while (choose != 0);
//            subject.chooseSubject(scan, idx, studen, data);
    }

    void viewSubject(Scanner scan, int idx, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        do {
            System.out.println("====================");
            System.out.println("|   Subject List   |");
            System.out.println("====================");
            System.out.println("| 1. Math          |");
            System.out.println("| 2. Science       |");
            System.out.println("| 3. Social        |");
            System.out.println("| 0. Back          |");
            System.out.println("====================");
            System.out.println("| Choose [1-3] :   |");
            System.out.println("====================");
            choose1 = scan.nextInt();
            scan.nextLine();
            if (choose1 == 1){
                try {
                    studen.get(idx).math.get(0).display(scan, idx, teache, studen, data);
                } catch (Exception e){
                    System.out.println("No Data in Math!");
                    System.out.println("Press enter to Continue...");
                    scan.nextLine();
                }
            } else if (choose1 == 2){
                try {
                    studen.get(idx).science.get(0).display(scan, idx, teache, studen, data);
                } catch (Exception e){
                    System.out.println("No Data in Science!");
                    System.out.println("Press enter to Continue...");
                    scan.nextLine();
                }
            } else if (choose1 == 3){
                try {
                    studen.get(idx).social.get(0).display(scan, idx, teache, studen, data);
                } catch (Exception e){
                    System.out.println("No Data in Social!");
                    System.out.println("Press enter to Continue...");
                    scan.nextLine();
                }
            } else if (choose1 == 0){
                studmenu(scan, idx, teache, studen, data);
            }
        } while (choose1 != 0);
    }

    void  viewScore(Scanner scan, int idx, ArrayList<Teacher> teache, ArrayList<Student> studen, Data data){
        try {
            try {
                System.out.println();
                System.out.println("Math : ");
                studen.get(idx).math.get(0).display(scan, idx, teache, studen, data);
            } catch (Exception e){
                System.out.println("No Data in Math!");
            }
            System.out.println();
            try{
                System.out.println("Science : ");
                studen.get(idx).science.get(0).display(scan, idx, teache, studen, data);
            } catch (Exception e){
                System.out.println("No Data in Science!");
            }
            System.out.println();
            try{
                System.out.println("Social : ");
                studen.get(idx).social.get(0).display(scan, idx, teache, studen, data);
            } catch (Exception e){
                System.out.println("No Data in Social!");
            }
            studen.get(idx).math.get(0).back(scan, idx, teache, studen, data);
        } catch (Exception e){
            System.out.println();
            System.out.println("There are no Data!");
            System.out.println("Press enter to Continue...");
            scan.nextLine();
            studmenu(scan, idx, teache, studen, data);
        }
    }
}
