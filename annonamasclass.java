class o
{
    public void  get(){
        System.out.println(" add");
    }
}
public class annonamasclass {
    public static void main(String[] args) {
        o ob1=new o()
        {
            public void get() {
                System.out.println("subtraction");
            }
        };
        ob1.get();

    }
}
