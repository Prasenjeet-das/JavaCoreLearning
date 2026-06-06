import java.util.Scanner;
public class Addfirstnandlast {
    static Scanner sc = new Scanner(System.in);
    public static int isAddfirstnandlast(int number) {
        int last = number%10;
        while(number>9){
            number=number/10;
        }
        return (number+last);

      
    }
    public static void main (String[] args){
        System.out.println("enter the number atleast 3 number enter");
        int number = sc.nextInt();
        System.out.println("the sum of first and last digit is "+isAddfirstnandlast(number));
    }
    
}