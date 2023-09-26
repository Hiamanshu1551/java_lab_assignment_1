import java.util.*;
public class string_toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String g="";
        for(int i=0;i<s.length();i++){
            char c;
            
            c=s.charAt(i);
            if(c>=65 && c<=90){
                g=g+(char)(c+32);

            }
            else{
                g=g+(char)(c-32);
            }
            
        }
        System.out.println(g);
    }
}
