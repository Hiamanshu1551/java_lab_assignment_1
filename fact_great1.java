import java.util.*;

class fact_great1 {
    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }

    static void great(int a, int b) {
        int c = a > b ? a : b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        fact_great1 f = new fact_great1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("factorial");
        f.factorial(c);
        System.out.println("greatest no.");
        f.great(a, b);

    }

}