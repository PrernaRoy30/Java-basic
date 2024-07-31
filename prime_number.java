/*Implement a method to check whether a given number is prime or not, and use it to find all
prime numbers within a given range*/

import java.util.Scanner;
class prime_number
{
	static Boolean prime(int n)
	{
		int i,num=n,c=0;
		for(i=2;i<num;i++) 
		{
			if(num % i == 0)
			{
				c++;
				return false;
			}	
		}
		return true;
	}
	public static void main(String args[])
	{
		int s,e,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Range : ");
		s = sc.nextInt();
		System.out.println("Enter Ending Range : ");
		e = sc.nextInt();
		for(k=s;k<=e;k++)
		{
			if (prime(k))
			{
				System.out.println(k);
			}
		}
	}
}
