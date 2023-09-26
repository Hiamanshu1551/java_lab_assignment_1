import java.util.*;

public class array_sum {
    public static void main(String[] args) {
        int size, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the no.");
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);

        }
        for (int i = 0; i < size; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum of array " + sum);

    }

}
