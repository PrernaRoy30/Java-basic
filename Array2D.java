import java.util.Scanner;
class Array2D
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	int row,col,i,j,sum=0;
	float avg;
	System.out.println("Enter Row : ");
	row = sc.nextInt();
	System.out.println("Enter Col : ");
	col = sc.nextInt();
	int[][] arr = new int[row][col];
	for(i=0;i<row;i++)
	{	
		for(j=0;j<col;j++)
		{
			System.out.println("Enter Number : ");
			arr[i][j] = sc.nextInt();
		}
	}
	for(i=0;i<row;i++)
	{	
		for(j=0;j<col;j++)
		{
			sum += arr[i][j];
		}
	}
	avg = (float) sum/(row*col);
	System.out.println("Total : "+sum);
	System.out.println("Average : "+avg);
    }
}