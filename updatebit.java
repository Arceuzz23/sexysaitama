import java.util.*;
public class updatebit {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int op=sc.nextInt();
        int n=5;
        int pos=1;
        int bw=1<<pos;
        //setbit
        if(op==1)
        {
            int newi=n|bw;
            System.out.println(newi);

        }
        else
        //cleabit
        {
            int newi=n&(~bw);
            System.out.println(newi);

        }
        sc.close();
    }
    
}
