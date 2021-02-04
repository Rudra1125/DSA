package Array;

import java.util.Scanner;

public class MinimumNoJumps {

	public static int minJumps(int []arr) {
		int n =arr.length;
		if(n<=1) {
			return 0;
		}
		if(arr[0]==0) {
			return -1;
		}
		int maxrange=arr[0];
		int steps=arr[0];
		int jump=1;
		for(int i=1;i<n;i++) {
			if(i==n-1) {
				return jump;
			}
			maxrange=Math.max(maxrange,i+arr[i]);
			steps--;
			if(steps==0) {
				jump++;
				if(i>=maxrange) {
					return -1;
				}
				steps=maxrange-i;
				
			}
		}return jump;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(minJumps(arr));
	}

}
