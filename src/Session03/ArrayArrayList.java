package Session03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayArrayList {
    public static void main(String[] args) {
//        int[] satuD = new int[100];
//        satuD[0] = 0;
        int[][] duaD = new int[10][10];

        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            score.add((int)(Math.random()*1000)); //randomize number
        }
//        score.set(5,20);
//        score.sort((a, b) -> a > b ? 1 : (a < b ? -1 : 0)); //sorting ascending
//        score.sort((a, b) -> a > b ? -1 : (a < b ? 1 : 0)); //sorting descending
        Collections.sort(score); //sorting ascending
        Collections.reverse(score); //sorting descending
        for (int i = 0; i < 10; i++) {
            System.out.println(score.get(i)); //mengambil value dari variabel score
        }
        score.remove(0); //remove first index
        score.remove(score.size()-1); //remove last index
//        score.clear(); //remove all
        System.out.println(score.get(0)); //mengambil value dari variabel score //out of bounds krna melebihi size
        System.out.println("size : " + score.size());
    }
}
