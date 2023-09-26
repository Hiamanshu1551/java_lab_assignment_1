import java.util.*;

public class string_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter the string");
        s = sc.next();
        int i, j, flag;
        i = 0;
        j = s.length() - 1;
        flag = 0;
        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
            }
            i = i + 1;
            j = j - 1;

        }
        if (flag == 0) {
            System.out.println("palindrom");

        } else {
            System.out.println("not palindrom");
        }
    }

}
