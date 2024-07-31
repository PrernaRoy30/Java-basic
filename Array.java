/*Create a program to find the largest and smallest elements in an array of integers.*/

import java.util.Scanner;
import java.util.Arrays;
class Array
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	int size,i;
	System.out.println("Enter Size of Array : ");
	size = sc.nextInt();
	int[] arr = new int[size];
	for(i=0;i<size;i++)
	{
		System.out.println("Enter Number : ");
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Min : "+arr[0]);
	System.out.println("Max : "+arr[size - 1]);
    }
}
	
	