package ismtrain;

import java.util.Scanner;

public class Shift{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int ar1[] = {1,2,3,4,5},n,k;
		System.out.println("Enter element to Shift");
		n=sc.nextInt();
		System.out.println("Before Shifting");
		for(int i=0;i<ar1.length;i++)
		{
				System.out.print(" "+ar1[i]);
		}
		for(k=1;k<=n;k++)
		{
		int temp=0;
		temp=ar1[ar1.length-1];
		//System.out.println("Before Shifting");
		/*for(int i=0;i<ar1.length;i++)
		{
				System.out.print(" "+ar1[i]);
		}*/
		for(int i=ar1.length-1;i>0;i--)
		{
				ar1[i]=ar1[i-1];
		}
		ar1[0]=temp;
		//System.out.println(" ans is");
		/*for(int i=0;i<ar1.length;i++)
		{2
				System.out.print(" "+ar1[i]);
		}*/
		
		if(k==n)
		{    System.out.println(" ans is");
			for(int i=0;i<ar1.length;i++)
		   {
				System.out.print(" "+ar1[i]);
		   }
		}
		}
	}
	}