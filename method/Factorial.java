import java.util.Scanner;
public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println(isfactorial(n));
    }
    public static int isfactorial(int n){
        int ans= 1;
        for(int i=1;i<=n;i++){
            ans = ans*i;

        }
        return ans;
    }

    }
    

