/**
* name: sahana B V
*Description : Find second smallest number in an array
* date:3/19/2021
*/
import java.util.Scanner;

public class NumberTypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		final int n=sc.nextInt();
		int [] arr=new int[n];
		int positiveNumbersCount=0,negativeNumbersCount=0,oddNumbersCount=0,evenNumbersCount=0,zerosCount=0;
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negativeNumbersCount++;
				arr[i]*=-1;
			}
			if(arr[i]%2==1)
				oddNumbersCount++;
			if(arr[i]==0)
				zerosCount++;
		}
		positiveNumbersCount=n-negativeNumbersCount;
		evenNumbersCount=n-oddNumbersCount;
		
		
		System.out.println("positiveNumbersCount: "+positiveNumbersCount);
		System.out.println("negativeNumbersCount: "+negativeNumbersCount);
		System.out.println("oddNumbersCount: "+oddNumbersCount);
		System.out.println("evenNumbersCount"+evenNumbersCount);
		System.out.println("zerosCount"+zerosCount);
	}

}
