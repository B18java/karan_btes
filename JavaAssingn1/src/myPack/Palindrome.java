package myPack;

public class Palindrome implements Check
{
	@Override
	public boolean checkString(String s) 
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s1))
		return true;
		else
			return false;
	}
	
	@Override
	public boolean checkInt(int i) 
	{
		String s=Integer.toString(i);
		String s1="";
		for(int j=s.length()-1;j>=0;j--)
		{
			s1=s1+s.charAt(j);
		}
		if(s1.equals(s1))
		return true;
		else
			return false;
	}
}

