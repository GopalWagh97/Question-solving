/* pascal Triangle printing using 2d Array*/

import java.util.Scanner;
    public class PascalTriangle
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter a rows number : " );
            int n=sc.nextInt();
            int[][]triangle=new int[n][n];
            for (int i = 0; i < n; i++)
            {
                triangle[i][0]=1;
                for (int j = 1; j <=i; j++)
                {
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
            }
            //printing the Pascal triangle
            for (int i = 0; i < n; i++)
            {
                //spacing for triangle
                for (int s = 0; s < n-1-i; s++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i ; j++)
                {
                    System.out.print(triangle[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
