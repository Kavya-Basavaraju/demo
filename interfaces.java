interface abcd
{
    void name();// by default it is abstruct

    void age();// by default it is abstruct
    int a=20;//by default it is static and final
    int b=30;//by default it is static and final
    void add();
}
class defg implements abcd
{
      public void name()
    {
        System.out.println("my name is kavya.");
    }
     public void age()
    {
        System.out.println("and my age is 21");
    }
    public  void add()
    {
        int a=2;
        int b=3;
        int c=a+b;
        System.out.println(c);
    }
}
//////------------MULTIPLE INHERITANCE USING INTERFACE WITH MULTIPLE CLASS---------------------//

interface  abc
{
    void kavya();
}
interface cde
{
    void kavya1();
}
class xyz implements abc,cde
{
    public void kavya(){
        System.out.println(" hi am in bangalore");
    }

    public void kavya1()
    {
        System.out.println(" i am kavya B");
    }
}

public class interfaces {
    public static void main(String[] args) {
        defg ob1=new defg();
        xyz ob2=new xyz();
        ob1.name();
        ob1.age();
        ob1.add();
        System.out.println(abcd.a);
        System.out.println(abcd.b);
        ob2.kavya();
        ob2.kavya1();
    }
}