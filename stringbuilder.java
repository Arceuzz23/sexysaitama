public class stringbuilder {
    public static void main (String args[])
    {
        StringBuilder sb= new StringBuilder("aryan");
        //sb.insert(2,'A');
        // System.out.println("new string: "+ sb );
        //sb.setCharAt(0,'P');
        //System.out.println("new string: "+ sb );
        //sb.insert(2,'L');
         //System.out.println("new string: "+ sb );
         sb.delete(2,4);
         System.out.println("new string: "+ sb );
         sb.append('y');
         System.out.println("new string: "+ sb );
    }
    
}
