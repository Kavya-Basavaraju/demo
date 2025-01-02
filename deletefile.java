//synatx
//file file =new file(".txt")
//file.delete

import java.io.File;

public class deletefile
{
    public static void main(String[] args) {
        File file=new File(("example3.txt"));
        if(file.exists()) {
            if (file.delete())
            {
                    System.out.println("successfully deleted");

                }
                else
                {
                    System.out.println("not deleted");
                }

        }
        else
        {
            System.out.println("not exixt");
        }
    }
}
