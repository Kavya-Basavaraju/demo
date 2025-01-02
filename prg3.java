class animals{
    public void detail(String colour,String type)
    {
        System.out.println("colour:"+colour);
        System.out.println("type of food:"+type);
    }
}

class dog1 extends animals
{
    public void detail1(String name,String  colour,String bread)
    {
        System.out.println("name:" +name );
        System.out.println("colour:" +colour );
        System.out.println("bread:" +bread );
    }
}
class babydog1 extends dog1
{
    public void detail2(String name, String colour,String bread,String gender)
    {
        System.out.println("name:"+name);
        System.out.println("colour:" +colour);
        System.out.println("bread:"+bread);
        System.out.println("gender:"+gender);
    }
}
public class prg3 {
    public static void main(String[] args) {
        babydog1 obj0=new babydog1();
        obj0.detail("black","veg");
        obj0.detail1("dolly","white","chow chow");
        obj0.detail2("mittu","black","chow chow","babygirl");
    }
}
