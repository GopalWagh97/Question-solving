/***Question 2***/
// Sort the array of 0's ,1's and 2's

import java.util.Scanner;
public class arraysort
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,2,0,1,2,1,2,0,0};
        int l=arr.length;
        int lo=0,mid=0,high=l-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                lo++;
                mid++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int s : arr )
        {
            System.out.print(s + " ");
        }
    }
}
