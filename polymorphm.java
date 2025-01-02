class over
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int c, float d)
        {
            System.out.println(c+d);
        }
}

public class polymorphm
{
    public static void main(String[] args) {
        over ob9=new over();
        ob9.add(3 ,4);
        ob9.add( 6,8f);
    }

}
