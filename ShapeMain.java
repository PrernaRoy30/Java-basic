/*Create an interface "Shape" with a method calculateArea(). Implement this interface with
classes representing different geometric shapes (e.g., Circle, Rectangle, Triangle). Use
polymorphism to calculate and display the area of each shape*/

interface Shape
{
	Double pi=3.14;
	Double calculateArea();
}
class Rectangle implements Shape
{
	private Double length,width;
	public Rectangle(Double l,Double w)
	{
		length = l;
		width = w;
	}
	public Double calculateArea()
	{
		return length * width;
	}
}
class Circle implements Shape
{
	private Double radius;
	public Circle(Double r)
	{
		radius = r;
	}
	public Double calculateArea()
	{
		return pi*radius*radius;
	}
}
class Tringle implements Shape
{
	private Double height,base;
	public Tringle(Double h,Double b)
	{
		height = h;
		base = b;
	}
	public Double calculateArea()
	{
		return 0.5*height*base;
	}
}
class ShapeMain
{
	public static void main(String arg[])
	{
		Rectangle R = new Rectangle(10.0,20.0);
		System.out.println("Area of Rectangle : "+R.calculateArea());
		Shape C = new Circle(10.0);
		System.out.println("Area of Circle : "+C.calculateArea());
		Shape T = new Tringle(10.0,20.0);
		System.out.println("Area of tringle : "+T.calculateArea());
	}
}
		