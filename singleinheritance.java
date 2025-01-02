class A
{
    public void hai()
    {
        System.out.println("hai");
    }
}
 class B extends A
 {
     public void hello()
     {
         System.out.println("hello");
     }
 }
 public class singleinheritance
{
    public static void main(String[] args) {
        B obj1=new B();
        obj1.hai();
        obj1.hello();
    }
}
