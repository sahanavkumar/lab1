
/**
* name: sahana B V
*Description : traffic signal display
* date:3/14/2021
*/
import java.util.Scanner;

public class TrafficSignal {
    public static void main(String [] args){

        System.out.println("enter the appropriate number");
        System.out.println("1. red");
        System.out.println("2.green");
        System.out.println("3.yellow");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        if(n==1)
        {
            System.out.println("stop");
        }
        else if(n==2)
        {
            System.out.println("go");
        }
        else if(n==3)
        {
            System.out.println("ready");
        }