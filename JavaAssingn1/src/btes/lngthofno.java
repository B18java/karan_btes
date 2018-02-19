package btes;

import java.util.Scanner;

public class lngthofno
{
	public static void main(String args[])
	{
		int l=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int a=s.nextInt();
		while(a>0)
		{
			a=a/10;
			l++;
		}
		System.out.println("length of no is "+l);
	}
}
