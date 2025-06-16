/* **Multiplication of Matrix by any m*n order ** */

import java.util.Scanner;

    class InputArray
    {
        public static void inputarr(int[][] arr, int[][] arr2, int r1, int c1, int r2, int c2)
        {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print("enter a elements of " + i +" "+ j);
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println();
            for (int i = 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    System.out.print("enter a elements of " + i + "" + j);
                    arr2[i][j] = sc.nextInt();
                }
            }
        }
    }
    class OutputArray
    {
        public static void PrintArray(int[][] arr, int [][]arr2,int r1, int c1, int r2, int c2)
        {
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public class MultiplicationOfMatrix
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a row1 and column1 ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            System.out.print("enter a row1 and column1 ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int[][] matrix1 = new int[r1][c1];
            int[][] matrix2 = new int[r2][c2];
            //matrix input
            InputArray.inputarr(matrix1,matrix2, r1, c1, r2, c2);
            // matrix print
            OutputArray.PrintArray(matrix1,matrix2, r1, c1, r2, c2);

            System.out.println();
            // multiplication matrix logic
            if(c1!=r2) System.out.print("multiplication not possible");
            else
            {
                int[][]ans = new int[r1][c2];
                for (int i = 0; i < r1; i++)
                {
                    for (int j = 0; j < c2; j++)
                    {
                        for (int k = 0; k < r2; k++)
                        {
                            ans[i][j] += matrix1[i][k]*matrix2[k][j];
                        }
                        System.out.print(ans[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

