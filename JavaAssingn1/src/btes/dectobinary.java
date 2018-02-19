package btes;
import java.util.*;

public class dectobinary
{
	public static void main(String args[])
	{
		
		String s="";
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=n;
		while(n>0)
		{
			if(n%2==0)
				s=s+'0';
			else
				s=s+'1';
			n=n/2;
		}
		System.out.println("binary of "+d+" is:");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
