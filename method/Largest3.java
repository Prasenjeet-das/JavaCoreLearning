public class Largest3 {
    public  static int largest(int a, int b, int c){

        if(a>b&&b>c)
            return a;
        if(b>a&&a>c)
            return b;
        else
            return c;

    }
    public static void main(String[] args){
        System.out.println("start");
        int res = largest(19,39,29);
        System.out.println("largest " +res);
        System.out.println("end");
    }
}
