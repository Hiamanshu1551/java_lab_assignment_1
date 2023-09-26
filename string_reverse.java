import java.util.*;
//error

public class string_reverse {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter the string");
        s = sc.next();
        i = s.length() - 1;
        j = i;
        while (i >= 0) {

            while (s.charAt(j) != ' ' && j > 0) {
                j--;
            }
        }
        if (j == 0) {
            k = 0;
        } else {
            k = j + 1;
        }
        while (k <= 1) {
            System.out.println(s.charAt(k));
            k++;
        }
        System.out.println(" ");
        i = j - 1;

    }

}                                      
