import java.util.*;
class student{
    int rollno;
    int clas;
    long contact;
    String name ,email;
 
  

    void detail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the detail");
        String name=new String();
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the rollno.");
        rollno=sc.nextInt();
        System.out.println("enter the class");
        clas=sc.nextInt();
        System.out.println("enter the contac no.");
        contact=sc.nextLong();
        System.out.println("enter the email");
        email=sc.nextLine();

        

    }
    void display(){
       
        System.out.println("name"+name);
        System.out.println("rollno."+rollno);
        System.out.println("class"+clas);
        System.out.println("contact"+contact);
        System.out.println("email"+email);
        
    }
    void marks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter physics marks");
        int physics=sc.nextInt();
        System.out.println("enter chemistry marks");
        int chemistry=sc.nextInt();
        System.out.println("enter maths marks");
        int maths=sc.nextInt();
        System.out.println("total marks"+(physics+chemistry+maths));

    }
    public static void main(String[] args) {
        student st=new student();
        st.detail();
        st.display();
        st.marks();
    }

}

