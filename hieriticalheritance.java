class a
{
    public void m1()
    {
        System.out.println("HELLO  I AM KAVYA");
    }
}
class b extends a
{
    public void m2(){
        System.out.println("HELLO I AM CHANDANA");
    }
}
class c extends a
{
    public void m3(){
        System.out.println("I AM TEJU");
    }

}

public class hieriticalheritance {
    public static void main(String[] args) {
        b ob1=new b();
        c ob2=new c();
        ob1.m1();
        ob1.m2();
        ob2.m3();
    }
}
