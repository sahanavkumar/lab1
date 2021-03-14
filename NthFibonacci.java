/**
* name: sahana B V
*Description : Find fibonacci series of nth place
* date:3/14/2021
*/

import java.util.Scanner;

public class NthFibonacci {
    public static int fib(int n)
    {
        int a=0,b=1,c;
        if (n==0)
            return a;

        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fib(n));

    }



}
