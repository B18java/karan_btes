package btes;
import java.util.*;
public class freq 
{
	public static void main(String args[])
	{
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(s1.indexOf(s.charAt(i))==-1)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
						count++;
				}
			}
			s1=s1+s.charAt(i);
			System.out.println(s.charAt(i)+" occurs "+count+" times");
		}
		
	}
}