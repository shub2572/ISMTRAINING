package ismtrain;
import java.util.Scanner;

public class Student {

     int studentId;
     String name;
     String email;
     String password;
     
     Student(){
    	 studentId = (int) (Math.random()*10000);
     }
     
     void input() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the name and email and password: ");
    	 name = sc.next();
    	 email=sc.next();
    	 password = sc.next();
    	 
     }
     
     void print() {
    	 System.out.println(studentId + "\t" + name + "\t" + email + "\t" + password);
     }
     public static void main(String[] args) {
		Student s = new Student();
		s.input();
		s.print();
	}
}