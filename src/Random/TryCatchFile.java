package Random;

import java.io.File;

public class TryCatchFile {
    public static void main(String[] args) {
        try {
            File file = new File("FolderData");
            if (!file.exists()) file.mkdir();
            file = new File("FolderData\\database.in");
            if (!file.exists()) file.createNewFile();
//            if (file.exists()) file.delete();
//            BufferReader(FileReader);
        } catch (Exception e){
            System.out.println("Application Error!");
        }
    }
}
