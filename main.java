import java.util.*;
public class main {
     static String ch;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s=sc.next();
        
        
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(65<=a && a<=90 ){
                ch+=a;
              
            }
            if(97<=a && a<=122){
                ch+=a;
                continue;

            }
            if(65<=a && a<=90){
                System.out.println(ch);
                
                ch="";
            }

    
        }
    }
}