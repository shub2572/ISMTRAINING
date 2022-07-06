package ismtrain;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
System.out.println("The first If else program");
              int n;
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number you want :  ");
        n = sc.nextInt();
        
        if(n == 10) {
        	System.out.println("The give no. is correct  " +n);
        }
        else {
        	System.out.println("The given no. is not correct");
        }
       
        
	}

}
