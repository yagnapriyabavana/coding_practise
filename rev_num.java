import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int rev_num=0;
	    while(num>0)
	    {
	        int rem=num%10;
	        rev_num=rev_num*10+rem;
	        num=num/10;
	    }
		
		System.out.println(rev_num);
	}
}
