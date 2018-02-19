package btes;
import java.util.*;
public class primepattern
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter no of rows");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int k=2;
		
		for(int i=1;i<=n;i++)
		{
			int count=1;		
				if(isprime(k) && count<=i)
				{
					System.out.print(k);
					count++;
					k++;
				}	
				else
					k++;
				System.out.println();
		}
		
	}
	public static boolean isprime(int n)
	{
		boolean p=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				p=false;
				break;
			}
		}
		return p;
	}
}
