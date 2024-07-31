/*Develop a program to demonstrate constructor overloading by creating multiple
constructors for a class.*/

import java.util.*;
class Q2
{
	int age=0;
	
	Q2()
	{
		System.out.println("No Argument");
	}
	Q2(int a)
	{
		age = a;
	}
	void dis()
	{
		System.out.println("Age " + age);
	}
	public static void main(String args[])
	{
		Q2 q1= new Q2();
		Q2 q= new Q2(10);
		q1.dis();
		q.dis();

	}
}


