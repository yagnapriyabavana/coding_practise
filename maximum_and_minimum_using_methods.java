import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        System.out.println("Enter number 3:");
        int c=sc.nextInt();
        System.out.println("maximum:"+max(a,b,c));
        System.out.println("minimum:"+min(a,b,c));
    }
        static int max(int num1,int num2,int num3)
        {
            if(num1>num2&&num1>num3)
            {
                return num1;
            }
            else if(num2>num3)
            {
                return num2;
            }
            else{
                return num3;
            }
        }
        static int min(int num1,int num2,int num3)
        {
            if(num1<num2&&num1<num3)
            {
                return num1;
            }
            else if(num2<num3)
            {
                return num2;
            }
            else{
                return num3;
            }
        }
    }
