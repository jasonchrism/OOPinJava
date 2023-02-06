package ProjectStudentTeacher;

import javax.swing.tree.ExpandVetoException;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherMenu {
    private int checkChoose = 0;
    private int choose;
    private int chooseStud;
    private int asgScore1;
    private int asgScore2;
    private int asgScore3;
    private int examScore1;
    private int examScore2;
    private double temp1;
    private double temp2;
    private double result;
    void teachMenu(Scanner scan, int idx, ArrayList<Teacher> teache, Data data, ArrayList<Student> studen){
        do {
            try {
                System.out.println("=============================");
                System.out.println("| Choose Subject :          |");
                System.out.println("| 1. Math                   |");
                System.out.println("| 2. Science                |");
                System.out.println("| 3. Social                 |");
                System.out.println("| 0. Back                   |");
                System.out.println("=============================");
                teache.get(idx).displayHi();
                System.out.println("Please Input between 1 - 3 : ");
                choose = scan.nextInt();
                scan.nextLine();
                if (choose == 1){
                    if (!teache.get(0).getUsername().equals("MathTeacher")){
                        System.out.println("Please choose the right subject (Science/Social)!");
                        System.out.println("Press enter to Continue...");
                        scan.nextLine();
                        teachMenu(scan, idx, teache, data, studen);
                    } else {
                        checkChoose = 1;
                    }
                } else if (choose == 2){
                    if (!teache.get(0).getUsername().equals("ScienceTeacher")){
                        System.out.println("Please choose the right subject (Math/Social)!");
                        System.out.println("Press enter to Continue...");
                        scan.nextLine();
                        teachMenu(scan, idx, teache, data, studen);
                    } else {
                        checkChoose = 1;
                    }
                } else if (choose == 3){
                    if (!teache.get(0).getUsername().equals("SocialTeacher")){
                        System.out.println("Please choose the right subject (Math/Science)!");
                        System.out.println("Press enter to Continue...");
                        scan.nextLine();
                        teachMenu(scan, idx, teache, data, studen);
                    } else {
                        checkChoose = 1;
                    }
                }
            } catch (Exception e){
                System.out.println();
                System.out.println("Please Input Number Only!");
                System.out.println("Press enter to Continue...");
                scan.nextLine();
                scan.nextLine();
                teachMenu(scan, idx, teache, data, studen);
            }
        } while (checkChoose != 1);
        if (choose == 1){
            do {
                try{
                    System.out.println("List of Studentss : ");
                    for (int i = 0; i < data.getStudent().size(); i++){
                        System.out.printf("%d." + data.getStudent().get(i).getName() + "\n", i + 1);
                    }
                    System.out.println("Choose Student :");
                    chooseStud = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e){
                    scan.nextLine();
                    System.out.println("Please Input between 1 to 3!");
                    chooseStud = -1;
                }
            } while (chooseStud  == -1);
            addScoreMath(scan, chooseStud-1, teache, data, studen);
        } else if (choose == 2){
            do {
                try{
                    System.out.println("List of Studentss : ");
                    for (int i = 0; i < data.getStudent().size(); i++){
                        System.out.printf("%d." + data.getStudent().get(i).getName() + "\n", i + 1);
                    }
                    System.out.println("Choose Student :");
                    chooseStud = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e){
                    scan.nextLine();
                    System.out.println("Please Input between 1 to 3!");
                    chooseStud = -1;
                }
            } while (chooseStud  == -1);
            addScoreScience(scan, chooseStud-1, teache, data, studen);
        } else if (choose == 3){
            do {
                try{
                    System.out.println("List of Studentss : ");
                    for (int i = 0; i < data.getStudent().size(); i++){
                        System.out.printf("%d." + data.getStudent().get(i).getName() + "\n", i + 1);
                    }
                    System.out.println("Choose Student :");
                    chooseStud = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e){
                    scan.nextLine();
                    System.out.println("Please Input between 1 to 3!");
                    chooseStud = -1;
                }
            } while (chooseStud  == -1);
            addScoreSocial(scan, chooseStud-1, teache, data, studen);
        } else if (choose == 0){
            new Login().login(scan, teache, studen, data);
        }
    }

    void addScoreMath(Scanner scan, int idx, ArrayList<Teacher> teache, Data data, ArrayList<Student> studen){
        do {
            try {
                System.out.print("Input Assignment 1 Score : ");
                asgScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore1 = -1;
            }
        } while (asgScore1 < 0 || asgScore1 > 100);

        do {
            try {
                System.out.print("Input Assignment 2 Score : ");
                asgScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore2 = -1;
            }
        } while (asgScore2 < 0 || asgScore2 > 100);

        do {
            try {
                System.out.print("Input Assignment 3 Score : ");
                asgScore3 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore3 = -1;
            }
        } while (asgScore3 < 0 || asgScore3 > 100);

        do {
            try {
                System.out.print("Input Examination 1 Score : ");
                examScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore1 = -1;
            }
        } while (examScore1 < 0 || examScore1 > 100);

        do {
            try {
                System.out.print("Input Examination 2 Score : ");
                examScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore2 = -1;
            }
        } while (examScore2 < 0 || examScore2 > 100);

        temp1 = ((asgScore1 + asgScore2 + asgScore3) / 3) * 0.4;
        temp2 = ((examScore1 + examScore2) / 2) * 0.6;
        result = temp1 + temp2;
        Math mat = new Math(asgScore1, asgScore2, asgScore3, examScore1, examScore2, result);
        studen.get(idx).math.add(mat);
        System.out.println("Score Inputted Successfully!");
        System.out.print("Press enter to continue...");
        scan.nextLine();
        teachMenu(scan, idx, teache, data, studen);
//        mat.display(scan, idx, teache, data, studen);
    }

    void addScoreScience(Scanner scan, int idx, ArrayList<Teacher> teache, Data data, ArrayList<Student> studen){
        do {
            try {
                System.out.print("Input Assignment 1 Score : ");
                asgScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore1 = -1;
            }
        } while (asgScore1 < 0 || asgScore1 > 100);

        do {
            try {
                System.out.print("Input Assignment 2 Score : ");
                asgScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore2 = -1;
            }
        } while (asgScore2 < 0 || asgScore2 > 100);

        do {
            try {
                System.out.print("Input Assignment 3 Score : ");
                asgScore3 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore3 = -1;
            }
        } while (asgScore3 < 0 || asgScore3 > 100);

        do {
            try {
                System.out.print("Input Examination 1 Score : ");
                examScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore1 = -1;
            }
        } while (examScore1 < 0 || examScore1 > 100);

        do {
            try {
                System.out.print("Input Examination 2 Score : ");
                examScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore2 = -1;
            }
        } while (examScore2 < 0 || examScore2 > 100);

        temp1 = ((asgScore1 + asgScore2 + asgScore3) / 3) * 0.4;
        temp2 = ((examScore1 + examScore2) / 2) * 0.6;
        result = temp1 + temp2;
        Science sci = new Science(asgScore1, asgScore2, asgScore3, examScore1, examScore2, result);
        studen.get(idx).science.add(sci);
        System.out.println("Score Inputted Successfully!");
        System.out.print("Press enter to continue...");
        scan.nextLine();
        teachMenu(scan, idx, teache, data, studen);
    }

    void addScoreSocial(Scanner scan, int idx, ArrayList<Teacher> teache, Data data, ArrayList<Student> studen){
        do {
            try {
                System.out.print("Input Assignment 1 Score : ");
                asgScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore1 = -1;
            }
        } while (asgScore1 < 0 || asgScore1 > 100);

        do {
            try {
                System.out.print("Input Assignment 2 Score : ");
                asgScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore2 = -1;
            }
        } while (asgScore2 < 0 || asgScore2 > 100);

        do {
            try {
                System.out.print("Input Assignment 3 Score : ");
                asgScore3 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                asgScore3 = -1;
            }
        } while (asgScore3 < 0 || asgScore3 > 100);

        do {
            try {
                System.out.print("Input Examination 1 Score : ");
                examScore1 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore1 = -1;
            }
        } while (examScore1 < 0 || examScore1 > 100);

        do {
            try {
                System.out.print("Input Examination 2 Score : ");
                examScore2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Please Input Number Only!");
                examScore2 = -1;
            }
        } while (examScore2 < 0 || examScore2 > 100);

        temp1 = ((asgScore1 + asgScore2 + asgScore3) / 3) * 0.4;
        temp2 = ((examScore1 + examScore2) / 2) * 0.6;
        result = temp1 + temp2;
        Social soc = new Social(asgScore1, asgScore2, asgScore3, examScore1, examScore2, result);
        studen.get(idx).social.add(soc);
        System.out.println("Score Inputted Successfully!");
        System.out.print("Press enter to continue...");
        scan.nextLine();
        teachMenu(scan, idx, teache, data, studen);
    }

}

//try{
//    File file = new File("C:\Windows\file.txt");
//} catch (Exception e){
//
//        }
