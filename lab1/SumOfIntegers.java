/**
* name: sahana B V
*Description : find sum of integers divisable by 3 and 6
* date:3/19/2021
*/


import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(" upto "+range+" is:"+calculateSum(n));
		

	}
	private static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

	}