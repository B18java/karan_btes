package btes;

import java.util.Scanner;

public class pat1 
{
	public static void main(String args[])
	{
		int n,i;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	
}
