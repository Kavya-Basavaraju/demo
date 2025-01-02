// FEATURE OF JAVA 8
//  1. INTERACE - we can define method inside interface  STATIC AND DEFAULT  are the  keyword ///class method is more priority then an  interface
//  2. FOR EACH METHOD  inbuilt
//  3.

interface  java
{
    default void mobile()
    {
        System.out.println("phone1");
    }
}
class w implements java
 {
        public void mobile()
        {
            System.out.println("phone3");
        }

 }
// interface ja
// {
//     static void mobile(){
//         System.out.println("samsung");
//     }
// }

public class java8 {
    public static void main(String[] args) {
        w ob1=new w();
        ob1.mobile();
//        ja.mobile();
    }
}
