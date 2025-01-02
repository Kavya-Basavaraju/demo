import javax.swing.text.Style;
import java.util.Scanner;
//--------------------addition and multiplication of matrix---------------------------
public class multiprg1
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" eneter the no of rows and colummns");
        int rows=in.nextInt();//declare
        int cols=in.nextInt();//declare

        int[][] a=new int[rows][cols];
        int[][] b=new int[rows][cols];
        int[][] c=new int[rows][cols];

        System.out.println("enter the elements of first matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                a[i][j]=in.nextInt();
            }

        }
        System.out.println("enter the elements of second matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                b[i][j]=in.nextInt();
            }

        }
        System.out.println("the sum and mul of the two matrix is ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                for(int k=0;k<cols;k++){
                    c[i][j]=c[i][j] + a[i][k] * b[k][j];
                }

            }

        }
        System.out.println(" multiplication of the matrixis ");
        System.out.println();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
