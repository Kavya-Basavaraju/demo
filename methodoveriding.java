class parent
{
    public void mobile()
    {
        System.out.println("red mi");
    }
}
class child extends parent
{
    public void mobile()
    {
        System.out.println("vivo");
    }
}
public class methodoveriding {
    public static void main(String[] args) {
        child objj1=new child();
        objj1.mobile();
    }
}
