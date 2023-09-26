import java.util.*;
public class array_count {
   public static void main(String[] args) {
    int size ,o=0,e=0,n=0;
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
        if(a[i]<0){
            n++;
        }
        else if(a[i]%2==0){
           e++;
        }
        else if(a[i]%2!=0){
            o++;
        }
    }
    System.out.println("odd"+o);
    System.out.println("even"+e);
    System.out.println("negative no."+n);

   }    
}
