package ismtrain;

import java.util.Scanner;

public class Cricketer {

	 private String name;
	 private int matchPlayed;
	 private int rank;
	 
	 public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the matchPlayed: ");
	     matchPlayed = sc.nextInt();
	 }
	 public int calculateRank() {
		if (matchPlayed >= 150) {
			System.out.println("the rank is 1");
		}
		else if (matchPlayed >=50) {
			System.out.println("the rank is 5");
		
		}
		else if (matchPlayed >=100) {
			System.out.println("the rank is 3");
		}
		else {
			System.out.println("the rank is 100");
		}
		 return rank;
	 }
	 public void display() {
		 System.out.println(name + "  " +matchPlayed+ "  "+rank );
	 }
	public static void main(String[] args) {
		Cricketer c[] =new Cricketer[3];
		for(int i=0;i<3;i++) {
			c[i] = new Cricketer();
			c[i].getData();
			
		}
		for(int i=0;i<3;i++) {
			c[i].display();
		   c[2].calculateRank();
		} 
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
