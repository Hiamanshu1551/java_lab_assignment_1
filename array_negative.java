import java.util.*;
public class array_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size ;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++){
            if(a[i]<0){
                System.out.println(a[i]);
            }
        }
       

    }
    
}
