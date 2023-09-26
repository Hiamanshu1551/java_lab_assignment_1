import java.util.*;
//error is occure

public class string_shortname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();

        System.out.println("enter first string");
        s = sc.next();
        int i, j;
        i = s.length()-1 ;
        j = 0;
        while (s.charAt(i) != ' ') { // from back (i),last name
            i--;
        }
        while (j < i) {
            if (j == 0) {             //from start (j),first name
                System.out.println(s.charAt(j) + ".");
            } else {

                char c, d;
                c = s.charAt(j);
                d = s.charAt(j + 1);
                if (c == ' ' && d != ' ') {
                    System.out.println(d + ".");//middle name
                }

            }
            j++;
        }
        System.out.println(s.substring(i));

    }

}
