//filereader.read() method small data
//fileinputstream() constructor
// files.readallfile

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;

public class Readefile {
    public static void main(String[] args) throws IOException  {
        String filename="e1.txt";
        try(FileReader reader=new FileReader(filename)){
            int chacters;
            while((chacters=reader.read())!=-1) {
                System.out.print((char) chacters);
            }
            }
            catch(IOException e){
                System.out.println(e);

        }

    }
}
