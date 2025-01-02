class food
{
    public void detail0(String food,String name,int rating)
    {
        System.out.println("type of food:"+food);
        System.out.println("name of food:"+name);
        System.out.println("rating:"+rating);
    }
}
class f1 extends food
{
    public void detail1( int price,String name,int  quality)
    {
        System.out.println("price:"+price);
        System.out.println("name of food:"+name);
        System.out.println("quality:"+quality);
    }
}
class f2 extends food
{
    public void detail2(String name, int price ,int quality)
    {
        System.out.println("food:"+name);
        System.out.println("price:"+price);
        System.out.println("quality:"+quality);
    }
}

public class prg4her
{
    public static void main(String[] args) {
        f1 ob1=new f1();
        f2 ob2=new f2();
        ob1.detail0("vegetarian","puri sagu",5);
        ob1.detail1(80,"puri sagu", 2);
        ob2.detail2("puri sagu",80, 2);
    }
}
