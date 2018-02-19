package btes;
import java.util.*;
public class pat4 
{
	public static void main(String args[])
	{
		int n,rem=0;
		System.out.println("enter 3 digit number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[2];
		while(n>0)
		{
			for(int i=0;i<a.length;i++)
			{
			rem=n%10;
			a[i]=rem;
			n=n/10;
			}
			
		}
		for(int p:a)
		{
			System.out.println(a[p]);
		}
	}

}
