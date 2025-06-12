/* ** question 1*/
// Rotate the given array 'a' by k steps where k is not an negative numbers\

import java.util.Scanner;
public class Rotating_array
{
    class Inputarray
    {
        public static void array(int arr[],int r)
        {
        for (int i = 0; i <r ; i++)
           {
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
            }
        }
    }
    class Outputarray
    {
        public static void printarray(int arr[],int r)
        {
            for (int i = 0; i <r ; i++)
            {
                System.out.print(arr[i]+" ");;
            }
            System.out.println();
        }
    }
   class rotating_array
   {
        public static void reverse(int arr[],int i,int j)
        {
           while(i<=j)
           {
               int temp= arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++; j--;
           }
        }
   }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a array size :");
        int r=sc.nextInt();
        int[] arr2=new int [r];

        Inputarray.array(arr2,r);
        Outputarray.printarray(arr2,r);

        System.out.println("enter a rotating value of k :");
        int k=sc.nextInt();
        k=k%r;

        rotating_array.reverse(arr2,0,r-k-1);
        rotating_array.reverse(arr2,r-k,r-1);
        rotating_array.reverse(arr2,0,r-1);

        Outputarray.printarray(arr2,r);
    }
}
