package btes;

import java.util.*;

public class gradingsys
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of marks");
		int no=s.nextInt();
		int n=no/10;
		switch(n)
		{
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("fail");
			break;
		case 5:
		case 6:
			System.out.println("avergae");
			break;
		case 7:
			System.out.println("good");
			break;
		case 8:
		case 9:
		case 10:
			if(no>100)
				System.out.println("invalid");
			
			else
				System.out.println("excellent");
			break;
			
			
		}
	}
}
