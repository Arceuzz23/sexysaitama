import java.util.*;
class multiply
{
    public static int multiplyab(int a , int b)
    {
        int product=a*b;
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=multiplyab(a,b);
        System.out.println(product);
        sc.close();

        

        }
    
}