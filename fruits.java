import java .util.*;
public class fruits{
    public static void main(String args[]){
        System.out.println("Enter your favorite fruit");
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch(fruit){
            case "apple":
            System.out.println("An read fruit");
            break;
            case "orange":
            System.out.println("A orange fruit");
            break;
            case "banana" :
            System.out.println("A yellow fruit");
            break;
            default:
            System.out.println("unknowm fruit");
            break;
           }  
        sc.close(); }
}
