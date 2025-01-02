@FunctionalInterface
interface k
{
     int ss(int a,int b);
}
public class lamdaexpressions {
    public static void main(String[] args) {
        k ob1=(a,b) -> (a+b);  //lamda expression feature of java 8
        int ob4=ob1.ss(3 ,4);
        System.out.println("sum of two no" );
    }
}
