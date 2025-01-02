class  T4 implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("SIR M VISVESWARYA INSTUTUTE OF TECHNOOGY");
            try {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class  T5  implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("SJM POLYTECHNIC CHITRADURGA");
            try {
                Thread.sleep(6000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class T6 implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("GUARDIAN ANGEL SCHOOL");
            try {
                Thread.sleep(7000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class multithreadinterface {
    public static void main(String[] args) {
        Runnable r =new T4();
        Runnable r1 =new T4();
        Runnable r2 =new T4();


    }
}
