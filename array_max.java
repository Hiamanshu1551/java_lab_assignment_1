import java.util.*;
public class array_max {
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
        
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                if(a[i]<a[j]){
                    int t=a[i];
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
            }
          
        }
        System.out.println("min"+a[0]);
        System.out.println("max"+a[size-1]);
        System.out.print("second max"+a[size-2]);

    }
}
