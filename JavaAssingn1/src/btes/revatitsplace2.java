package btes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class revatitsplace2 
{
	public static void main(String args[]) 
	{
		int i=0,j;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String sub;
		String s=sc.nextLine();
		int l=s.length();
		for(j=0;j<=l-1;j++)
		{
			if(s.charAt(j)==' ' || j==l-1)
			{
				if(j<l-1)
				{
					sub=s.substring(i,j);
					show(sub);
					i=j+1;
				}
				else
				{
					sub=s.substring(i,j+1);
					show(sub);
				}
				
			}
		}
		
				
	}
	public static void show(String sub)
	{
		for(int k=sub.length()-1;k>=0;k--)
		{
			System.out.print(sub.charAt(k));
		}
		System.out.print(" ");
	}

}
