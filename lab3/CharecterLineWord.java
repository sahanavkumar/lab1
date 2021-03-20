/**
* name: sahana B V
*Description : Find the number of line word charecters in java
* date:3/19/2021
*/
public class CharecterLineWord {

	public static void main(String[] args) {
		
		String str=" I am sahana";
		int cc=0,cw=0,cl=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='\n') {
				cl++;
			}
			else if (str.charAt(i) ==' ') {
				cw++;
			}
			else if (str.charAt(i)!=' ') {
				cc++;
			}
		}
		 System.out.println("\nNumber of lines : "+cl);
         System.out.println("\nNumber of words : "+cw);
         System.out.println("\nNumber of characters : "+cc);
	}

}
