package Array;

import java.util.Scanner;

public class TrappingRainWater {
	
	static Scanner s= new Scanner(System.in);	
	
	public static int trappingWaterBetter(int arr[],int n) {
		int left[]=new int[n];
		int right[]= new int [n];
		int max=Integer.MIN_VALUE;
		int result=0;
		
		for(int i=0;i<n;i++) {
			max=Math.max(arr[i],max);
			left[i]=max;
		}
		max=Integer.MIN_VALUE;
		for(int j=n-1;j>=0;j--) {
			max=Math.max(arr[j], max);
			right[j]=max;
		}
		for(int i=0;i<n;i++) {
			result+=Math.min(left[i], right[i])-arr[i];
		}
		return result;
	}
	
	public static int trappingWater(int arr[],int n) {
		int result=0;
		for(int i=1;i<n-1;i++) {
			int left=arr[i];
			for(int j=0;j<i;j++) {
				left=Math.max(arr[j], left);
			}
			int right=arr[i];
			for(int j=i+1;j<n;j++) {
				right=Math.max(arr[j], right);
			}
			result+=Math.min(left, right)-arr[i];
		}return result;
	}
	
	//Time Complexity--->O(n^2)
	//Space Complexity--->O(1)
	
	public static void main(String[] args) {
		int n=s.nextInt();
		int arr[]= takeInput(n);
		System.out.println(trappingWater(arr, n));
		System.out.println(trappingWaterBetter(arr, n));
	}



	private static int[] takeInput(int n) {
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

}
