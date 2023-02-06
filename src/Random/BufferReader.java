package Random;

import java.io.*;
import java.util.ArrayList;

public class BufferReader {

    static void buff(){
        try {
            File file = new File("FolderData\\database.in");
            if (file.exists()){
                FileReader fr = new FileReader(file.getAbsolutePath());
                BufferedReader reader = new BufferedReader(fr);
                String line = "";
                while ((line = reader.readLine()) != null){
                    String[] datas = line.split(" # ");
                    System.out.println(datas[1]);
                }
                reader.close();
            }
        } catch (Exception e){
            System.out.println("Application Error!");
        }
    }

    static void saveFile(String s1, String s2, String s3){
        try {
            File file = new File("FolderData\\database.in");
            if (file.exists()) {
                FileWriter fw = new FileWriter(file.getAbsolutePath());
                BufferedWriter writer = new BufferedWriter(fw);
                writer.write(s1 + " # " + s2 + " # " + s3 + " \n ");
                writer.close();
            }
        } catch (Exception e){
            System.out.println("Application Error!");
        }
    }
    public static void main(String[] args) {
        buff();
        String s1 = "Jason Ganteng";
        String s2 = "Shamgod ahut";
        String s3 = "bijix ahoy";
        saveFile(s1, s2, s3);
    }
}
