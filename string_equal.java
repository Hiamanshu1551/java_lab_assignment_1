import java.util.*;

public class string_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = new String();
        String second = new String();
        System.out.println("enter first string");
        first = sc.next();
        System.out.println("enter second string");
        second = sc.next();
        if (first.equals(second)) { // 1 method
            System.out.println("equal string");
        } else {
            System.out.println("not equal string");
        }
        if (first.equalsIgnoreCase(second)) { // 2 method
            System.out.println("equal string");
        } else {
            System.out.println("not equal string");
        }

    }

}
