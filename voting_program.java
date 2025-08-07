/*above 18 are eligible to vote*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age:");
        int age=sc.nextInt();
        eligibility(age);
        
    }
    static void eligibility(int age)
    {
        if(age>=18)
        {
            System.out.println("The person is eligible for voting");
        }
        else{
            System.out.println("The person is not eligible for voting");
        }
    }
}
