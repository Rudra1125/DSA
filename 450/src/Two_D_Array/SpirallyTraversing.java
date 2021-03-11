package Two_D_Array;

import java.util.ArrayList;

public class SpirallyTraversing {

	public static ArrayList<Integer> spiral(int [][]arr,int m,int n){
		ArrayList<Integer> output= new ArrayList<Integer>();

		int k=0; //starting row index
		int l=0; //starting column index

		while(k<m && l<n) {
			//first row

			for(int i=l;i<n;i++) {
				output.add(arr[i][k]);
			}
			k++;

			//last column
			for(int i=k;i<m;i++) {
				output.add(arr[i][n-1]);
			}n--;

			//last row
			if(k<m) {
				for(int i=n-1;i>=l;i--) {
					output.add(arr[m-1][i]);
				}m--;
			}//first column
			if(l<n) {
				for(int i=m-1;i>=k;i--) {
					output.add(arr[i][l]);
				}l++;
			}
		}return output;
	}

//	public static void spirallyTraverse(int [][] arr,int r,int c){
//		ArrayList<Integer> output= new ArrayList<Integer>();
//
//		int j=0 ,k=0;
//		for(int i=0,s=0;i<r&& s<c;i++,s++) {
//			for(j=i;j<c-i;j++) {
//				System.out.print(arr[k][j]+" ");
//			}j=j-1;
//			for(k=i+1;k<r-i;k++) {
//				System.out.print(arr[k][j]+" ");
//			}k=k-1;
//			for(j=j-1;j>=s;j--) {
//				System.out.print(arr[k][j]+" ");
//			}j=j+1;
//			for(k=k-1;k>i;k--) {
//				System.out.print(arr[k][j]+" ");
//
//			}k=k+1;
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15,16}};

		spiral(arr, 4, 4);

	}

}
