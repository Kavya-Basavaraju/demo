interface  aaa
{
    void set3();
    void set4();
}
class  bbb implements aaa
{
    public void set3()
    {
        System.out.println(" hello world");
    }
     public void set4()
    {
        System.out.println(" hello world");
    }
}
class ccc implements aaa
{

    public  void set4()
    {
        System.out.println(" HELLOW WORLD");
    }

    public void set3()
    {
        System.out.println(" HELLOW WORLD");
    }
}

public class hericaticalinterface {
    public static void main(String[] args) {
        ccc ob1 =new ccc();
        bbb ob2=new bbb();
        ob1.set3();
        ob2.set4();
    }
}
