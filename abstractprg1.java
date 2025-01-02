abstract  class arthematic
{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}
class aa1 extends arthematic
{
            void add()
            {
                int a=10;
                int b=20;
                System.out.println("addition of 2 no is");
                System.out.println(a+b);
            }
    void sub()
    {
        int a=10;
        int b=5;
        System.out.println("subtraction of 2 no is");
        System.out.println(a-b);
    }
    void mul()
    {
        int a=10;
        int b=20;
        System.out.println("multiplicationof 2 no is");
        System.out.println(a*b);
    }
    void div()
    {
        int a=10;
        int b=2;
        System.out.println("division of 2 no is");
        System.out.println(a/b);
    }
}

public class abstractprg1
{
    public static void main(String[] args) {
        {
            aa1 obje2=new aa1();
            obje2.add();
            obje2.sub();
            obje2.mul();
            obje2.div();

        }
    }
}
