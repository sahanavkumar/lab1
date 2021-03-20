/**
* name: sahana B V
*Description : find difference between sum of of squares and square of sum
* date:3/14/2021
*/


import java.util.Scanner;
import java.lang.Math;
public class CalculateDifference {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(n));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfN=0,sumOfSquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfSquares;
    	return sum;
    }
}