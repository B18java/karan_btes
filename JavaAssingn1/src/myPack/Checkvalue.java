package myPack;

public class Checkvalue implements Check
{

	@Override
	public boolean checkString(String s) 
	{
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
				return true;
		else
			return false;
	}

	@Override
	public boolean checkInt(int i) 
	{
		int flag=0;
		String s=Integer.toString(i);
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='0')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
}
