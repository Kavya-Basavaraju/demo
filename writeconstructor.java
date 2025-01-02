import java.io.FileOutputStream;
import java.io.IOException;

//SYNATX code
//fileoutputstream objname=new fileoutputstream("file name ");
// string object name ="welcome";
//byte[]bytes=object.getbytes();
//obj.write();
public class writeconstructor {
    public static void main(String[] args) {
        String filename="e1.txt";
        String content="welcome to  tata strive\n i am kavya\n i am from chitradurga\n i am living in bangalore";
        try(FileOutputStream foo=new FileOutputStream(filename))
        {
            byte[]bytes=content.getBytes();
            foo.write(bytes);
            System.out.println("file found ");

        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
