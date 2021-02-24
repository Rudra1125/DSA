package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
	static Scanner s= new Scanner(System.in);	

	public static int distribution(int arr[],int n,int m){
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=0;(m-1+i)<n;i++){
			min=Math.min(min,arr[m-1+i]-arr[i]);
		}

		return min;


	}

	private static int[] takeInput(int n) {
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}


	public static void main (String[] args)
	{
		//code
		int x=s.nextInt();
		while(x-->0){
			int n=s.nextInt();
			int arr[]= takeInput(n);
			int m=s.nextInt();
			System.out.println(distribution(arr, n,m));
		}
	}

}
