package Two_D_Array;

import java.util.Scanner;

public class Row_With_Max1 {

	private static int binarysearch(int arr[],int high ,int low) {

		if(high>=low) {
			int mid=low+(high-low)/2;
			if((mid==0 || arr[mid-1]==0) && arr[mid]==1) {
				return mid;
			}
			else if(arr[mid]==0) {
				return binarysearch(arr, high, mid+1);
				
			}
			else {
				return binarysearch(arr, mid-1, low);
			}
		}return -1;
	}

	public static int rowWithMax1s(int arr[][],int r,int c) {
		int maxrowIndex=0;
		int max=Integer.MIN_VALUE;
		int i=0;
		for(;i<r;i++) {
			int index=binarysearch(arr[i],c-1,0);
			if(index!=-1 && (c-index)>max) {
				max=c-index;
				maxrowIndex=i;
			}
		}return maxrowIndex;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int r= s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println(rowWithMax1s(arr, r, c));
	}

}
