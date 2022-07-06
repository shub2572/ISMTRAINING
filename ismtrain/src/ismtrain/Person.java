package ismtrain;

import java.util.Scanner;

public class Person {
	private String  firstName;
	private String lastName;
	private String gender;
	private int salary;

	void input() {
		 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the firstName  ");
    	 firstName = sc.next();
    	 System.out.println("Enter the lastName  ");
    	 lastName = sc.next();
    	 System.out.println("Enter the gender  ");
    	 gender = sc.next();
    	 System.out.println("Enter the salary  ");
    	 salary = sc.nextInt();
		
	}
	void print() {
		System.out.println(firstName+ "\t" +lastName + "\t"+ gender + "\t"+ salary);
		
	}
	public String getFirstName() {
		 return firstName;
	}
	public String getLastName() {
		 return lastName;
	}
	public String getGender() {
		 return gender;
	}
	public void setFirstName(String fn) {
		 firstName = fn;
	}
	public void setLastName(String ln) {
		 lastName = ln;
	}
	public void setGender(String g) {
		 gender = g;
	}
	public static void main(String[] args) {
		Person p1 =new Person();
		Person p2 =new Person();
		Person p3 =new Person();
		p1.input();
		p2.input();
		p3.input();
		System.out.println("the details are given below:");
		p1.print();
		p2.print();
		p3.print();
	}
}
