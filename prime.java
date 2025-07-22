import java.util.*;
public class Main{
    void prime(int n)
    {
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
    }
    public static void main(String args[])
    {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        m.prime(sc.nextInt());
        
    }
}
