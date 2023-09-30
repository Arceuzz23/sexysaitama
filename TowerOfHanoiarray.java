//Tower Of Hanoi : there are three towers( sorce, helper, destination) which are used to transfer all the discs from tower s to d.
//Rules: Only one disk transferred in one step and smaller disks are alwyas kept on top of larger disks.
import java.util.*;
public class TowerOfHanoiarray {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of blocks in the source tower:");
        int n=sc.nextInt();
        int s[]= new int[n];
        int h[]= new int[n];
        int d[]= new int[n];
        int i;int c=0;int k=1;
         for(i=0;i<n;i++)
        {
            s[i]=k;
            k++;        
        }
        
        for(i=0;i<n;i++)
        {
           h[i]= s[n-i-1];            
        }
       
         for(i=0;i<n;i++)
        {
           d[i]= h[n-i-1];            
        }
          for(i=0;i<n;i++)
        {
            System.out.println(d[i]);         
        }
       
        

       
    }
    
}
