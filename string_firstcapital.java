import java.util.*;
public class string_firstcapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String g="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=97 &&c<=122 &&  i==0){
                g=g+(char)(c-32);
                
            }
            else{
                g=g+s.charAt(i);
                
            }

        }
        System.out.println(g);
    }
    
}
