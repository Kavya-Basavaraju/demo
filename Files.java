import java.io.File;
import java.io.IOException;

// 3types of file
//1.createnewfile  METHOD
//2.fileoutputstream  CONSTRUCTOR
// 3.files.write  METHOD

public class Files {
    public static void main(String[] args) throws IOException {
        String filename="Myfile.txt";
        File file=new File(filename);
        if(file.createNewFile()){
            System.out.println("file found");
        }
        else {
            System.out.println("file not found");
        }

    }
}
