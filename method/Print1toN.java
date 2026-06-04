import java.util.Scanner;
public class Print1toN{
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the number");
        System.out.println("---------------------------");
        int n = sc.nextInt();
        isprint1toN(n);
    }
    public static void isprint1toN(int n){
        System.out.println("My given number is my number ");
        System.out.println("---------------------------");
            for(int i=1;i<=n;i++){
                System.out.println(i+"");
        }
    
        }
    }
