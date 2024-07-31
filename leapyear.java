import java.util.Scanner;
class leapyear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		year = sc.nextInt();
		if (year % 100 == 0)
		{
			if (year % 400 == 0 && year % 4 == 0)
			{
				System.out.println("Its a century and leap year.");
			}
			else 
			{
				System.out.println("Its not a leap year.");
			}
			
		}
		else if (year % 4 == 0)
		{
			System.out.println("Its a leap year.");
		}
		else 
		{
			System.out.println("Its not a leap year.");
		}
	}
}
				
			
	