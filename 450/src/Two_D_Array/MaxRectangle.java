package Two_D_Array;

import java.util.Scanner;
import java.util.Stack;

public class MaxRectangle {

	//this is code to find the area of the histogram
	
	private static int maxarea(int [] arr) {
		if(arr.length==0) {
			return 0;
		}
		if(arr.length==1) {
			return arr[0];
		}
		int max=Integer.MIN_VALUE;
		Stack<Integer> st=new Stack<>();
		st.push(0);
		
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			if(curr>=arr[st.peek()]) {
				st.add(i);
			}
			else {
				while(!st.isEmpty() && curr<arr[st.peek()]) {
					int temp=arr[st.pop()];
					if(st.isEmpty()) {
						max= Math.max(max, temp*i);
					}else {
						max=Math.max(max, temp*(i-st.peek()-1));
					}
				}
				st.add(i);
			}
		}
		if(!st.isEmpty()) {
			int i=arr.length;
			while(!st.isEmpty()) {
				int temp=arr[st.pop()];
				if(st.isEmpty()) {
					max= Math.max(max, temp*i);
				}else {
					max=Math.max(max, temp*(i-st.peek()-1));
				}
			}
		}

		return max;
	}
	
	public static int maxRectangleArea(int mat[][], int m ,int n) {
		int max=maxarea(mat[0]);
		
		for(int i=1;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==1) {
					mat[i][j]=mat[i][j]+mat[i-1][j];
					
				}
				
			}
			max=Math.max(max, maxarea(mat[i]));
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int mat[][]= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		maxRectangleArea(mat, m, n);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
