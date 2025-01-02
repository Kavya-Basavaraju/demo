import java.io.FileOutputStream;

public class fileoutputstream {
    public static void main(String[] args) {
        String fileName="expample2.txt";
        try(FileOutputStream fos =new FileOutputStream(fileName)){
            System.out.println(" file found");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
