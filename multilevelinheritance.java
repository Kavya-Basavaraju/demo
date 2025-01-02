class x
{
    public void hai()
    {
        System.out.println("hai");
    }
}
class  y  extends x
{
    public void hello()
    {
        System.out.println("hello");
    }
}
class z extends  y
{
    public void hai()
    {
        System.out.println("hai");
    }
}


public class multilevelinheritance
{
    public static void main(String[] args) {
     z obj6=new z();
     obj6.hai();
     obj6.hello();
     obj6.hai();
    }
}
