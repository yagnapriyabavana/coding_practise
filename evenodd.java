import java.util.*;
class evenodd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}