package ismtrain;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDiary1 {

	 ArrayList<Person> telephone = new ArrayList<Person>();
	 
	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		  Person ps = new Person();
		while(true) {
			
			 System.out.println("1: Add new Contact");
	            System.out.println("2: Edit Contact");
	            System.out.println("3: Search Contact");
	            System.out.println("4: Remove Contact");
	            System.out.println("5: Exit From App");
	            
	            int n = sc.nextInt();
	            switch (n) {
	                case 1:
	                	System.out.println("enter first name");
	                    ps.setFirstName()
	                    System.out.println("enter last name");
	                    lastName = sc.next();
	                    System.out.println("enter mobile number");
	                    number = sc.nextInt();
	                    count++;
	                   
	                    break;
	                case 2:
	                    
	                	break;
	                case 3:
	                    
	                    break;
	                case 4:
	                    
	                    break;
	                case 5:
	                    
	                    break;
	                case 6:
	                    
	                	break;
	                default:
	                    
	                	break;
			
		}
		 
	}
	 
	 
	 
class Person{
		     
		   private String number;
		   private String firstName;
		   private String lastName;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getFirstname() {
			return firstName;
		}
		public void setFirstname(String firstname) {
			this.firstName = firstname;
		}
		public String getLastname() {
			return lastName;
		}
		public void setLastname(String lastname) {
			this.lastName = lastname;
		}
	 }
   }
	 
}
