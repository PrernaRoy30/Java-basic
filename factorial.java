import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int num,i,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			f *= i;
		}
		System.out.println("Factoria of "+num+" = "+f);
	}
}
	