/**
* name: sahana B V
*Description : find prime numbers till the integer number
* date:3/14/2021
*/

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String [] args)
    {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        PrimeTillN(n);
    }
    public static void PrimeTillN(int num)
    {
        int i,j,k=0;
        for(i=1;i<=num;i++)
        {
            if (i == 1 || i == 0)
                continue;
            k = 1;
            for (j = 2; j <= i /2; j++)
            {
                if (i % j == 0)
                {
                    k = 0;
                    break;
                }
            }
            if (k == 1) {
                System.out.print(i + " ");
            }
        }
    }

}
