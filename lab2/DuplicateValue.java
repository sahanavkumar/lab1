/**
* name: sahana B V
*Description : get the list of products with duplicate values
* date:3/17/2021
*/



import java.util.Scanner;

public class DuplicateValue {
    public static void main(String [] args)
    {
        int []arr=new int[]{1,2,3,3,4,4,5,6};
        int n;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]==arr[k]){
                    System.out.print(arr[k]);}
            }
        }
    }
}
