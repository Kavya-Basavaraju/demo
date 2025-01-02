class dog
{
    public void details(String name,String  colour,String bread)
    {
        System.out.println("name:" +name );
        System.out.println("colour:" +colour );
        System.out.println("bread:" +bread );
    }
}
class babydog extends dog
{
    public void details2(String name, String colour,String bread,String gender)
    {
        System.out.println("name:"+name);
        System.out.println("colour:" +colour);
        System.out.println("bread:"+bread);
        System.out.println("gender:"+gender);
    }
}
public class pg1 {
    public static void main(String[] args) {
        babydog obj2=new babydog();
        obj2.details("dolly","white","chow chow");
        obj2.details2("mittu","black","chow chow","babygirl");
    }
}
