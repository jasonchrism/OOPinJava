package Session03;

import java.util.Scanner;
import java.util.Vector;

public class Vectorrrrrr {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Jason"); //push tail
        vec.add(0, "Chrisbellno"); //add menggeser value index //push mid
        vec.set(1, "Mackenzie"); //set menimpa value index
        System.out.println(vec.capacity());
        System.out.println(vec.get(0));
        System.out.println(vec.get(1));
        vec.addElement("Aryo");
        vec.add("Abdhy");
        System.out.println(vec.get(2));
        System.out.println(vec.get(3));

        int a = sc.nextInt();
        System.out.println(fibo(a));
    }

    static Scanner sc = new Scanner(System.in);
//    method
    static int fibo(int n){
        if (n <= 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
