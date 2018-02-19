package btes;

import java.util.Scanner;

public class attpatrn
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n/2+1;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(" ");
			}
			char k='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			k--;
			for(int j=1;j<i;j++)
			{
				k--;
				System.out.print(k);
			}
			System.out.println();
		}
		/*for(int i=1;i<=n/2;i++)
		{
			int p=1;
			for(int j=1;j<=i;j++)
			{
				System.out.println();
			}
			for(int j=1;j<=n-1-p;j++)
			{
				
			}
		}*/
	}

}
