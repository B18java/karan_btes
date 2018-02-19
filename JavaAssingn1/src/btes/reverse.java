package btes;

import java.util.Scanner;

public class reverse
{
	public static void main(String args[])
	{
		int rev=0,rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int a=s.nextInt();
		int n=a;
		while(a>0)
		{
			rev=rev*10;
			rem=a%10;
			rev=rev+rem;
			a=a/10;
		}
		System.out.println("reverse of number is "+rev);
		if(rev==n)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
			
	}
}
