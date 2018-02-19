package btes;
import java.util.*;
public class fibbo
{
	public static void main(String args[])
	{
		int n,f=0,s=1,x;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
		{
			System.out.print(f);
		}
		else if(n==2)
		{
			System.out.print(f+" "+s);
		}
		else
		{
			System.out.print(f+" "+s+" ");
			for(int i=1;i<=n-2;i++)
			{
				x=f+s;
				System.out.print(x+" ");
				f=s;
				s=x;
			}
		}
	}

}
