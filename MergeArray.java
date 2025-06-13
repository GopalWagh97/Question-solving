/***Question 3 => merge two array ****/

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter 1st array size :");
        int r=sc.nextInt();

        System.out.print("enter 1st array size :");
        int c=sc.nextInt();

        int []arr1=new int [r];
        int l1= arr1.length;

        int []arr2=new int [c];
        int l2= arr2.length;
        //arr1 input
        for (int i = 0; i < l1; i++)
        {
            System.out.print("enter arr1 elements:" );
            arr1[i]=sc.nextInt();
        }
        //arr2 input
        for (int j = 0; j < l2; j++)
        {
            System.out.print("enter arr2 elements:" );
            arr2[j]=sc.nextInt();
        }
        //sort arr1
        Arrays.sort(arr1);
        //sort arr2
        Arrays.sort(arr2);
        //print arr1
        for (int s: arr1) System.out.print(s+" ");
        System.out.println();
        //print arr2
        for (int s2: arr2) System.out.print(s2+" ");

      //  merge two array in crr[]
        int crr[]=new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2)
        {
            if (arr1[i]<=arr2[j])
            {
                crr[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                crr[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==l1)
        {
            while(j<l2)
            {
                crr[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==l2)
        {
            while(i<l1)
            {
                crr[k]=arr1[i];
                i++;
                k++;
            }
        }
        System.out.println();
        //print final sort crr[], after merging two array
        for(int m: crr) System.out.print(m+" ");
    }
}
