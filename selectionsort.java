//In selection sort the sorting occurs only once in one iteration.
//Chosing the smallest or the largest and swapping with the other is the basic concept used in selection sort.
import java.util.*;
public class selectionsort {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("enter elements of array");
        for(i=0;i<n;i++)        
        a[i]=sc.nextInt();
        System.out.println("enter order of array in which you have to sort");
        String op=sc.next();
        if(op.compareTo("increasing")==0)
        {
            for(i=0;i<n;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(a[j]<a[i])
                    {
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }
            }
            for(i=0;i<=n-1;i++)
            System.out.println(a[i]);
        }
        if(op.compareTo("decreasing")==0)
        {
            for(i=0;i<n;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(a[j]>a[i])
                    {
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }
            }
            for(i=0;i<=n-1;i++)
            System.out.println(a[i]);
        }
    }
}