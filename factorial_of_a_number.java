/*factorial of a given number*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num=sc.nextInt();
        if (num<0){
            System.out.println("Enter a valid number");
        }else{
        System.out.println("Factorail of the given number is:"+factorial(num));}
        
    }
    static long factorial(int num)
    {
        long fact=1; 
        if(num==0 || num==1)
        {
            return 1;
        }else{
            while(num>0)
            {
               fact*=num;
               num-=1;
            }
        }
     return fact;
      
    }
}
