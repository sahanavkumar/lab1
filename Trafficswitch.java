/**
* name: sahana B V
*Description : display traffic signal using switch
* date:3/14/2021
*/

import java.util.Scanner;

public class TrafficSwitch {
    public static void main(String [] args)
    {
        System.out.println("enter the appropriate number");
        System.out.println("1. red");
        System.out.println("2.green");
        System.out.println("3.yellow");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        switch( n)
        {
            case 1:System.out.println("stop");
            break;
            case 2:System.out.println("go");
            break;
            case 3:System.out.println("ready");
            break;
        }
    }
}
