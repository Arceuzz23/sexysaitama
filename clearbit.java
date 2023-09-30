public class clearbit {
    public static void main (String args[])
    {
        int n=5;
        int pos=2;
        int bm=1<<pos;        
        int newi=n&(~bm);
        System.out.println(newi);
    }
    
}
