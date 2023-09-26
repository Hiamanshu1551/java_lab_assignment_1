import java.util.*;
public class array_copy {
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int a[] = new int[size];
        int b[]=new int[a.length];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the no.");
            a[i] = sc.nextInt();
    
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
    
        }
        b=a;
        for(int i=0;i<size;i++){
            System.out.println(b[i]);
        }
        
    }
}
