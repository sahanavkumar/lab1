/**
* name: sahana B V
*Description : convert rupees to dollar
* date:3/14/2021
*/

import java.util.Scanner;

public class SumOfCubes {

    public static void main(String[] args) {
        int d;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        d=cubeSum(n);
        System.out.println("sum of cubes is" + d);
    }
    public static int cubeSum(int num)
    {
        int sum = 0, cube;
        while (num != 0)
        {
            int n = num % 10;
            cube = n * n * n;
            sum = sum + cube;
            num = num / 10;

        }
        return sum;
    }
}