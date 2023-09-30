/*
in insertion sorting we divide the array in two groups and then we compare the element from the later group controlled by i 
with the former one controlled by j.
the swapping takes place only once in one iteration as if a number is found to be greater it's position index is stored and
then swapped.
 */
import java.util.*;
public class insertionsort
{
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
        if(op.compareTo("decreasing")==0)
        {
            for(i=0;i<n-1;i++)
            {
                int k=i;
                for(j=i+1;j<n;j++)
                {
                    if(a[k]<a[j])
                    {
                        k=j;
                    }
                }
                int t=a[k];
                a[k]=a[i];
                a[i]=t;
            }
            System.out.println("The sorted array is:");
            for(i=0;i<n;i++)
            System.out.println(a[i]);
        }
        if(op.compareTo("increasing")==0)
        {
            for(i=0;i<n-1;i++)
            {
                int k=i;
                for(j=i+1;j<n;j++)
                {
                    if(a[k]>a[j])
                    {
                        k=j;
                    }
                }
                int t=a[k];
                a[k]=a[i];
                a[i]=t;
            }
            System.out.println("The sorted array is:");
            for(i=0;i<n;i++)
            System.out.println(a[i]);
        }
    }
}



            
                                 