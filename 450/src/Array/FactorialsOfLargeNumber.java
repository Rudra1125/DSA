package Array;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialsOfLargeNumber {
	
	private static void fact(int n){
	    
		if(n<=1){
		     System.out.print(n);
		     return;
		 }
		 BigInteger b= new BigInteger("1");
		 for(int i=2;i<n;i++){
		     b= b.multiply(BigInteger.valueOf(i));
		 }
		 System.out.println(b);
		    
		    
	}
	
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
    	 int n=s.nextInt();
    	 int arr[]= new int[n];
    	 for(int i=0;i<n;i++){
    	     arr[i]=s.nextInt();
    	     
    	 }
    	 for(int i=0;i<n;i++){
    	     fact(arr[i]);
    	 }
	}

}
