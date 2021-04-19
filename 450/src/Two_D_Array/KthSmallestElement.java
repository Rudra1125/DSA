package Two_D_Array;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KthSmallestElement {

	//binary search approach
	public static int kthSmallestBInarySearch(int arr[][],int n,int k) {
		return smallest(arr,n,k);
	}
	
	
	private static int smallest(int[][] arr, int n, int k) {
		// TODO Auto-generated method stub
		int l=arr[0][0];
		int h=arr[n-1][n-1];
		while(l<h) {
			int mid=l+(h-l)/2;
			if(count(arr,n,mid)<k) {
				l=mid+1;
			}else {
				h=mid;
			}
		}
		
		return h;
	}


	private static int count(int[][] arr, int n, int mid) {
		// TODO Auto-generated method stub
		int i=n-1, j=0,c=0;
		while(i>=0 && j<n) {
			if(arr[i][j]<=mid) {
				c+=i+1;
				j++;
			}else {
				i--;
				
			}
		}
		return c;
	}


	public static int kthSmallestElement(int arr[][] ,int k,int n) {
		Queue<number> p= new PriorityQueue<number>();
		for(int i=0;i<arr[0].length;i++) {
			p.add(new number(0,i,arr[0][i]));
		}
		int count =0;
		while(!p.isEmpty()) {
			number e=p.poll();
			count++;
			if(k==count) {
				return e.val;
			}
			int rowIndex=e.rowIndex;
			int columnIndex=e.columnIndex;
			if(rowIndex+1<arr.length) {
				number ele= new number(rowIndex+1,columnIndex+1,arr[rowIndex+1][columnIndex+1]);
				p.add(ele);
			}
			
		}return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {{1 ,5, 9},
			{1,11,13},
			{12,13,15}};
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
//		int arr[][]=new int [n][n];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=s.nextInt();
//			}
//		}
//		int k=s.nextInt();
		
		System.out.println(kthSmallestElement(ar, 8, ar.length));
	}



	static class number implements Comparable<number>{
		int rowIndex;
		int columnIndex;
		int val;

		public number(int rowIndex,int columnIndex,int val) {
			this.rowIndex=rowIndex;
			this.columnIndex=columnIndex;
			this.val= val;

		}

		@Override
		public int compareTo(number o) {
			// TODO Auto-generated method stub
			return this.val-o.val;
		}
	}
}