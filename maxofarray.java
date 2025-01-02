public class maxofarray
{
    public static void main(String[] args) {
        //------------------------maxmumu of  array number--------------
        //   int[] a={2,67,89,45,67,89,24};
        // int max =a[0];
        //for(int i=0;i<a.length;i++)
        //if(a[i]>max)
        //{
        //  max=a[i];
        //}
        //System.out.println(max);

   //----------------------minumum of the numbers-------------
        int[] a={2,67,89,45,67,89,24};
        int min =a[0];
        for(int i=0;i>a.length;i++)
            if(a[i]<min)
            {
                min=a[i];
            }
        System.out.println(min);

    }
}

