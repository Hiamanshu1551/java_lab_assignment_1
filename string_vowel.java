import java.util.*;

public class string_vowel {
    public static void main(String[] args) {
        int co = 0, v = 0, i;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter the string");
        s = sc.nextLine();
        s = s.toUpperCase();
        for (i = 0; i < s.length(); i++) {
            char c;
            c = s.charAt(i);
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    v++;

                } else
                    co++;
            }

        }
        System.out.println("vowels" + v);
        System.out.println("consonent" + co);

    }
}
