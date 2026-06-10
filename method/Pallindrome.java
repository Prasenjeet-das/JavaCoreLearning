import java.util.*;
public class Pallindrome{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number");
        int m = sc.nextInt();
        System.out.println(slove(m )? "Pallindrome" : "Not Pallindrome");
    }

    
    public static boolean slove(int m){
        int temp = m;
        int rev =0;
        while(m>0){
            rev = rev*10+m%10;
           m/=10;

        }
        return temp == rev;
    } 
}