package btes;

public class revatitsplace 
{
	public static void main(String args[])
	{
		String s="asr is beutiful city and i love asr";
		String k[]=s.split(" ");
		for(int i=0;i<k.length;i++)
		{
			for(int j=k[i].length()-1;j>=0;j--)
			{
				System.out.print(k[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
