/**
* name: sahana B V
*Description : Find second smallest number in an array
* date:3/19/2021
*/
import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallestNumber{ 


public static void main(String args[]){  

int b[]={44,66,99,77,33,22,55};  
 
System.out.println("Second smallest: "+getSecondSmallest(b,7));  
}
   
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];
} 
} 
