import java.util.*;
public class array2d {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row of the array");
        int n=sc.nextInt();
        System.out.println("enter the column of the array");
        int m=sc.nextInt();int j;
        int a[][]= new int[n][m];
        int i;System.out.println("enter the elements of the array");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("enter the no. to be searched");
        int x=sc.nextInt();
        for(i=0;i<n;i++)
        {for(j=0;j<n;j++)
            {
            int k=i+1;int p=j+1;
            if(a[i][j]==x)
            System.out.println("the index of the searched no. is = "+k+p);

        }
        
    }

    }
}