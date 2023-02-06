package Task1;

import java.util.Scanner;

public class TheBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 0; i < input; i++){
            int check = 0;
            for (int j = 0; j < input; j++){
                if (i == 0 || i == input - 1 || j == 0 || j == input - 1 || j == input - 1 - i || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
