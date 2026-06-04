public class Casechange {
    public static void main(String[] args){
        String str = "Hello Javascript";
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ans+=(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                ans+=(char)(ch+32);
            }
            else{
                ans+=ch;
            }
        }
        System.out.println(ans);
    }
}