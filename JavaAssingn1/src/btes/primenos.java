package btes;
import java.util.*;
public class primenos
{
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(prime(i))
			{
				System.out.print(i+" ");
			}
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
