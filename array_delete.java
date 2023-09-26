import java.util.*;
public class array_delete {
    public static void main(String[] args) {
        int size ;
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
        System.out.println("enter position ");
        int pos=sc.nextInt();
        for(int i=0;i<size;i++){
            if(i==pos-1){
                continue;
            }
            System.out.println(a[i]);
        }

    }
    
}
