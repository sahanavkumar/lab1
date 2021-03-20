/**
* name: sahana B V
*Description : test if an array contains a specific value
* date:3/17/2021
*/

import java.util.Arrays;

public class SpecificValue {
    public static void main(String [] args)
    {
        int num;
        int[]arr=new int[]{};
        int specific;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        for(int i=0;i<num;i++)
        {
            arr[i]=in.nextInt();
        }
        specific=in.nextInt();
        for(int j=0;j<arr.length-1;j++){
            if(specific==arr[j])
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");}
            }
        }
    }