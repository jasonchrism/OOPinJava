package Task1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RankGPA {

    static int partition(int low, int high, double[] data){
        int i = low - 1;
        int j = low;
        double pivot = data[high];
        while (j < high){
            if (data[j] > pivot){
                i++;
                double temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
            j++;
        }
        double temp = data[i+1];
        data[i+1] = data[high];
        data[high] = temp;
        return (i+1);
    }
    static void quickSort(int low, int high, double[] data){
        if (low < high){
            int pos = partition(low, high, data);
            quickSort(low, pos - 1, data);
            quickSort(pos + 1, high, data);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        double[] data = new double[100];
        for (int i = 0; i < cases; i++){
            data[i] = scan.nextDouble();
        }
        quickSort(0, cases, data);
        int j = 1;
        for (int i = 0; i < cases; i++){
            if (data[i] == data[j-1]){
                System.out.print(j);
            } else {
                System.out.print(i+1);
                j++;
            }
            System.out.print(" ");
            DecimalFormat df = new DecimalFormat("0.00");
//            df.setMaximumFractionDigits(2);
            System.out.println(df.format(data[i]));
        }
    }
}
