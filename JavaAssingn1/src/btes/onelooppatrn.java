package btes;

public class onelooppatrn 
{
	public static void main(String args[])
	{
		char a[]={'*','*','*','*','*'};
		for(int i=0;i<5;i++)
		{
			System.out.println(a);
			a[i]=' ';
		}
	}

}