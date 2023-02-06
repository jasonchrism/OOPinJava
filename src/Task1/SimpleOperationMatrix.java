package Task1;

import java.util.Scanner;

public class SimpleOperationMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] data = new int[5][5];
        int choose;
        int rowcol;
        int value;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                data[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        int min = 1002;
        int max = -1002;
        int op = scan.nextInt();
        for (int i = 0; i < op; i++){
            choose = scan.nextInt();
            rowcol = scan.nextInt();
            value = scan.nextInt();
            if (choose == 0){
                for (int k = 0; k < 5; k++){
                    data[rowcol][k] += value;
                }
            } else {
                for (int k = 0; k < 5;k++){
                    data[k][rowcol] += value;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                sum = sum + data[i][j];
                if (data[i][j] < min){
                    min = data[i][j];
                }
                if (data[i][j] > max){
                    max = data[i][j];
                }
            }
        }
        System.out.println(sum + " " + min + " " + max);
    }
}
