/*Write a Java program to calculate the area and perimeter of a rectangle.*/

import java.util.Scanner;
class rectangle
{
	
	float area(float l,float w)
	{
		float ans;	
		ans = l*w;
		return ans;
		
	}
	float peri(float l,float w)
	{
		float ans;	
		ans = 2*(l+w);
		return ans;
		
	}
	public static void main(String args[])
  	{
		float length,width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		length = sc.nextFloat();
		System.out.println("Enter width : ");
		width =	sc.nextFloat();

		rectangle r = new rectangle();

		System.out.println("Area of Rectangle : "+r.area(length,width));
		System.out.println("Perimeter of Rectangle : "+r.peri(length,width));
   	}
}