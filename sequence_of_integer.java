import java.util.Scanner;
class sequence_of_integer
{
	public static void main(String args[])
	{
		int sum=0,count=0,num=0;
		float avg=0.0f;
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter Number : ");
			num = sc.nextInt();
			if (num < 0)
			{
				break;
			}
			sum += num;
			count += 1;	
		}
		avg = (float) sum/count;
		System.out.println("Total = "+sum);
		System.out.println("Average = "+avg);
	}
}
