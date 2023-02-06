package Session06.Main;

import Session06.Perwira;
import Session06.Pion;
import Session06.Sel;
import Session06.WarnaEnum;

import java.util.ArrayList;

public class Polymorphism {
    /*
    overloading
    - nama function sama
    - jumlah parameter beda
    - tipe data parameter beda

    overriding
    - nama function sama
    - beda antar class
     */

//    abstract class --> class yang memiliki abstract method/function
//    abstract method --> method yang belum dideskripsikan

//    interface
//    semua method adalah abstract
//    semua atributnya const

    public static void main(String[] args) {
//        Perwira p = new Perwira('A', 1, WarnaEnum.PUTIH);
        Pion pion = new Pion('A', 2, WarnaEnum.PUTIH);

        ArrayList<Sel> jalan = pion.kemungkinanJalan();
        for (Sel sel: jalan) {
            System.out.println("" + sel.col + sel.row);
        }
    }
}
