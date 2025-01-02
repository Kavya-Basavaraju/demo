public class exception
{
    public static void main(String[] args) {
        int[] array= new int[4];
          int a=20;
          int b=2;
         try
         {
             System.out.println(a/b);
             for(int i=0;i<=4;i++)
             {
                 System.out.println(array[i+1]);
             }
         }
         catch(Exception e)
        {
            System.out.println(e);
        }
         //finally {
          //   System.out.println("bye bye bye bye bye bye bye bye ");
         //}
    }
}
