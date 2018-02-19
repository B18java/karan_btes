package btes;
import java.util.*;
public class maxinarry
{
	public static void main(String args[])
	{
		int max;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 elements");;
		int a[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=1;i<=4;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum element in array is "+max);
		
	}
}
