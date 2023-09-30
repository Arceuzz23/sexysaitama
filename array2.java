//aise hi github ke leye ye bckd karra tha wtf
import java.util.*;
public class array2 {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]= new int[n];
        int i;System.out.println("enter the elements of the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the no. to be searched");
        int x=sc.nextInt();
        for(i=0;i<n;i++)
        {int k=i+1;
            if(a[i]==x)
            System.out.println("the index of the searched no. is = "+k);

        }
        
    }

    }
    

