package Task2;

import java.util.Scanner;
import java.util.Vector;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rotate = sc.nextInt();
        int[] value = new int[num];

        for (int i = 0; i < num; i++) {
            value[i] = sc.nextInt();
        }
        int limit = rotate % num;
        for (int i = 0; i < limit; i++) {
            int temp = value[num-1];
            for (int j = num-1; j > 0; j--) {
                value[j] = value[j-1];
            }
            value[0] = temp;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(value[i] + " ");
        }
    }
}
