import java.util.*;
public class string_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        int[] b=new int[26];
        for(int i=0;i<s.length();i++){
        b[s.charAt(i)-97]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                System.out.println(s.charAt(i)+"="+b[i]);
            }
            else if(b[i]==1){
                System.out.println(s.charAt(i)+"="+b[i]);
            }
            else if(b[i]>1){
                System.out.println(s.charAt(i)+"="+b[i]);
            }
        }


    }
}
