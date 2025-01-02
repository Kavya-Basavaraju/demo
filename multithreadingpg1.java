// MULTITHREADING USING CLASs
class  T1  extends Thread
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


class  T2  extends Thread
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

class  T3  extends Thread
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



public class multithreadingpg1
{
    public static void main(String[] args)
    {
        T1 ob2=new T1();
        T2 ob3=new T2();
        T3 ob4=new T3();
        ob3.start();
        ob2.start();
        ob4.start();
    }
}
