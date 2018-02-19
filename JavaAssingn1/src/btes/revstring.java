package btes;

public class revstring 
{
	public static void main(String args[])
	{
		String s="nitin",s1="";
		boolean flag=true;
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
	
	System.out.println(s1);
	if(s.equals(s1))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
}	
}