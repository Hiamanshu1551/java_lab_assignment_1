import java.util.*;
public class string_count {
    public static void main(String[] args) {
        int co = 1, i;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter the string");
        s = sc.nextLine();
        for(i=0;i<s.length()-1;i++){
            char c,d;
            c=s.charAt(i);
            d=s.charAt(i+1);
            if(c==' ' && d!=' '){
                co=co+1;
            }
            
        }
        System.out.println("total no. of words"+co);
    }
    
}
