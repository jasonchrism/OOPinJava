package Task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] kata = word.toCharArray();
        int len = word.length();
        int r = len;
        int count = 0;
        for (int i = 0; i < len; i++){
            r--;
            if (kata[i] == kata[r]){
                count++;
            }
        }
        if (count == len){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
