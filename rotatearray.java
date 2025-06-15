public class rotatearray
{
    public static void main(String[]args)
    {
       int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
       int m= arr.length;
       int [][]brr=new int[3][3];
       System.out.println();
       for (int i = 0; i < m; i++)
       {
            for (int j = 0; j < m; j++)
            {
                brr[i][j]=arr[j][i];
            }
       }
       for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
       }
        System.out.println();
        //reverse kardo
        for (int i = 0; i <m ; i++) {
            int a=0,b=m-1;
            while(a<b){
                int temp=brr[i][a];
                brr[i][a]=brr[i][b];
                brr[i][b]=temp;
                a++;
           }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

