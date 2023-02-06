package Session06;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;

public abstract class Perwira {
    private int poin;
    private WarnaEnum warna;
    protected Sel posisi;

    public WarnaEnum getWarna(){
        return warna;
    }
    protected Perwira(Sel sel, WarnaEnum warna){
        this.posisi = sel;
        this.warna = warna;
    }
    protected Perwira(char col, int row, WarnaEnum warna){ // protected gabsa di access di luar class dan anaknya protected harus diturunkan untuk diciptakan.
        poin = 1;
        this.warna = warna;
        this.posisi = new Sel(col, row);
    }

//    public ArrayList<Sel> kemungkinanJalan (){
////        return new ArrayList<>();
////    }

    public abstract ArrayList<Sel> kemungkinanJalan();
}

