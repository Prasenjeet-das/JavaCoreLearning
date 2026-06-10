import java.util.*;
public class MaxandMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int m = sc.nextInt();
        slove(m);

    }
    public static void slove(int m){
       int max= m%10;
       int min=m%10;
       while(m>0){
        max = Math.max(m%10, max);
        min = Math.min(m%10, min);
        m /= 10;
       }
       System.out.println("Max is " + max);
       System.out.println("Min is " + min);
    }

}