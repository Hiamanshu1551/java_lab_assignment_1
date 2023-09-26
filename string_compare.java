import java.util.*;
public class string_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        String s1=sc.next();
        s1=s1.toLowerCase();
        int s2=s.compareTo(s1);
        System.out.println(s2);
    }
    
}
