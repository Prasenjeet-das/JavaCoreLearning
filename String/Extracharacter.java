public class Extracharacter{
    public static void main(String[] args){
        String str = "j5a9s6j8s7";
        int sum =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
               sum += (ch-48);
            }
        }
        System.out.println(sum);

    }
} 

/* note  
1.small character is char ch = 'a';
(char)(ch - 32) 
2.captial character is chat ch ='A
(char) (ch+32)


*/