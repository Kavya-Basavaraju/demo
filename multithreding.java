class gu extends Thread
{
    public void run()
    {
        System.out.println("hello");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class bb extends  Thread
{
    public void run()
    {
        System.out.println("hii");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class multithreding {
    public static void main(String[] args) {
        gu ob2=new gu();
        bb ob3 =new bb();
        ob2.start();
        ob3.start();
    }
}
