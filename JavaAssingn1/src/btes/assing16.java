package btes;
abstract class Figure
{
	double d1;
	abstract void findarea();
	abstract void findPerimeter();
}
class Circle extends Figure
{
	Circle(int a)
	{
		d1=a;
	}
	void findarea()
	{
		System.out.println("Area of circle is "+3.14*d1*d1);
	}
	void findPerimeter()
	{
		System.out.println("Perimeter of circle is "+3.14*2*d1);
	}
	
}
class Rectangle extends Figure
{
	double d2;
	Rectangle(int a,int b)
	{
		d1=a;
		d2=b;
	}
	void findarea()
	{
		System.out.println("Area of Rectangle is "+d1*d2);
	}
	void findPerimeter()
	{
		System.out.println("Perimeter of Rectangle is "+(d1+d2));
	}
	
}
class Triangle extends Figure
{
	double d2,d3;
	Triangle(int a,int b,int c)
	{
		d1=a;
		d2=b;
		d3=c;
	}
	void findarea()
	{
		double s=(d1+d2+d3)/2;
		double ans=Math.sqrt(s*s-d1*s-d2*s-d3);
		System.out.println("Area of Triangle is "+ans);
		
	}
	void findPerimeter()
	{
		System.out.println("Perimeter of Triangle is "+(d1+d2+d3));
	}
	
}
public class assing16
{
	public static void main(String args[])
	{
		Figure a[]=new Figure[6];
		a[0]=new Circle(10);
		a[1]=new Circle(20);
		a[2]=new Rectangle (20,10);
		a[3]=new Rectangle (20,40);
		a[4]=new Triangle (10,20,50);
		a[5]=new Triangle (30,20,10);
		
		a[0].findarea();
		a[0].findPerimeter();
		System.out.println();
		a[1].findarea();
		a[1].findPerimeter();
		System.out.println();
		a[2].findarea();
		a[2].findPerimeter();
		System.out.println();
		a[3].findarea();
		a[3].findPerimeter();
		System.out.println();
		a[4].findarea();
		a[4].findPerimeter();
		System.out.println();
		a[5].findarea();
		a[5].findPerimeter();
		
	}

}
