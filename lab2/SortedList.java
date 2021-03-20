/**
* name: sahana B V
*Description : get the sorted list of products name
* date:3/17/2021
*/

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.sort;

public class SortedList {
    public static void main(String [] args)
    {
        ArrayList<String>list=new ArrayList<String>();
        list.add("sahana");
        list.add("shriya");
        list.add("deepak");
        list.add("vijay");
        list.add("ashwin");
        Collections.sort(list);
        System.out.println(list);
    }

}