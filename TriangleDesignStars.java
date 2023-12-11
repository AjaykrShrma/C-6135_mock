import java.util.Scanner;

public class TriangleDesignStars
{
    public static void main(String ak[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
Enter no. of rows
5
* 
* * 
* * * 
* * * * 
* * * * * 
    */
