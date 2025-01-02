abstract class i
{
    public abstract void add(int a,int b);
    public abstract void sub(int c,int d);
    public abstract void div(int e,int f);
    public abstract void mul(int e,int h);

}
public class anamusclassabstruct {
    public static void main(String[] args) {
        i ob1=new i()
        {
            public void add(int a, int b)
            {
                System.out.println("add:"+a+b);
            }
            public void sub(int a, int b)
            {

            }
            public void div(int a, int b) {

            }
            public void mul(int a, int b) {

            }
        };
        ob1.add(2,3);
        ob1.sub(2,3);
        ob1.mul(4,5);
        ob1.div(2,2);
    }
}
