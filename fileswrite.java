import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class fileswrite {
    public static void main(String[] args) {
        String fileName="example3.txt";
        try
        {
            Files.write(Paths.get(fileName),"hi  iam kavya".getBytes());
            System.out.println("File Created");
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
