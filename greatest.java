import java.util.*;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = a > b && a > c ? a : b > a && b > c ? b : c;
        System.out.println(k);
    }

}
