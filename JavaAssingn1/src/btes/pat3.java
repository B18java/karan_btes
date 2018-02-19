package btes;
import java.util.*;
public class pat3 
{
	public static void main(String args[])
	{
		int rem=0,i=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		int a[]=new int[10];
		while(n>0)
		{
			rem=n%10;
			a[i]=rem;
			i++;
			n=n/10;
		}
		for(int j=i-1;j>=0;j--)
		{
			for(int k=1;k<=a[j];k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
