package Array;

import java.util.Scanner;

public class MaximumSubArray {

	public static int maxSubarraySum(int arr[], int n){

		// Your code here
		int  sum = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			int sum1=0;
			for(int j=i;j<n;j++){
				sum1= sum1+arr[j];
				if(sum1>sum){
					sum=sum1;
				}
			}
		}return sum;
	}
	
	private static int[] takeInput(int n) {
		Scanner s= new Scanner(System.in);
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}return arr;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= takeInput(n);
		System.out.println(maxSubarraySum(arr,n));
	
	}

}
