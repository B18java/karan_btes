package btes;
import myPack.*;
import java.util.*;

public class Check1 
{
	public static void main(String args[])
	{
		Palindrome p=new Palindrome();
		Checkvalue cv=new Checkvalue();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String s=sc.nextLine();
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		boolean b1=p.checkString(s);
		boolean b2=p.checkInt(a);
		boolean b3=cv.checkString(s);
		boolean b4=cv.checkInt(a);
		
		if(b1== true)
			System.out.println("Palindrome String");
		else
			System.out.println("not a palindrome String");
		

		if(b2== true)
			System.out.println("Palindrome Integer");
		else
			System.out.println("not a palindrome Integer");

		if(b3== true)
			System.out.println("String has space");
		else
			System.out.println("string has no space");
		
		if(b4==true)
			System.out.println("integer contains zero");
		else
			System.out.println("integer does not contains zero");
	}
}
