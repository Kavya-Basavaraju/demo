import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileread1 {
    public static void main(String[] args) {
        String filename = "e1.txt";
        try (FileInputStream fss = new FileInputStream(filename)) {
            int byteValue;
            while ((byteValue = fss.read()) != -1) {
                System.out.print((char) byteValue);
            }
        } catch (IOException e) {
            System.out.println(e);

        }


    }
}

