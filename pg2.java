class car
{
       public void details3(int price ,String fuel)
       {
           System.out.println("price:"+price);
           System.out.println("fuel:"+fuel);
       }
}

class bmw extends car
{
        public void details4(int wheels ,String name)
        {
            System.out.println("no of wheels:"+wheels);
            System.out.println("name:"+name);
        }
}


public class pg2
{
    public static void main(String[] args) {
        bmw obj4=new bmw();
        obj4.details3(2334,"petrol");
        obj4.details4(4,"BMW");

    }
}
