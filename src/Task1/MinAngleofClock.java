package Task1;

import java.util.Scanner;

public class MinAngleofClock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] value;
         if (input.charAt(2) == '.'){
             value = input.split("\\.");
         } else {
             value = input.split(":");
         }

        double hour = Double.parseDouble(value[0]);
        double min = Double.parseDouble(value[1]);

        double minRes = min / 60 * 360;
        double hourRes = (hour / 12 * 360) + (min / 60 * 360 / 12);
        double result = Math.abs(hourRes - minRes);
        double result2 = Math.abs(360 - result);
        System.out.println(Math.min(result, result2));
    }
}