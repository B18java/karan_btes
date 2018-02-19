package btes;

import java.util.Scanner;

public class newpat 
{
	public static void main(String args[])
	{
		int n,i;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=4*i;j++)
			{
				if(prime(j) && count<=i)
					{
					System.out.print(j);
					count++;
					}
			}
			System.out.println();
		}
	}
	static boolean prime(int k)
	{
		boolean p=true;
		for(int j=2;j<=k/2;j++)
		{
			if(k%j==0)
			{
				p=false;
				break;
			}
		}
		return p;
	}

}
