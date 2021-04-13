package Two_D_Array;

import java.util.Scanner;

public class FindSpecificPair {

	public static int specificPair(int[][] mat,int n) {
		int max=Integer.MIN_VALUE;
		for(int a=0;a<n-1;a++) {
			for(int b=0;b<n-1;b++) {
				for(int c=a+1;c<n;c++) {
					for(int d=b+1;b<n;b++) {
						if((mat[c][d]-mat[a][b])>max) {
							max=mat[c][d]-mat[a][b];
						}
					}
				}
			}
		}return max;
	}
	
	public static int specificPairBetter(int[][] mat,int n) {
		int maxVAlue=Integer.MIN_VALUE;
		int [][] maxArr= new int [n][n];
		maxArr[n-1][n-1]= mat[n-1][n-1];
		int maxV=mat[n-1][n-1];
		for(int j=n-2;j>=0;j--) {
			if(mat[n-1][j]>maxV) {
				maxV=mat[n-1][j];
			}
			maxArr[n-1][j]=maxV;
		}
		maxV=mat[n-1][n-1];
		for(int i=n-2;i>=0;i--) {
			if(mat[i][n-2]>maxV) {
				maxV=mat[i][n-2];
			}
			maxArr[i][n-2]=maxV;
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				if (maxArr[i+1][j+1] - mat[i][j] > maxVAlue)
                    maxVAlue = maxArr[i + 1][j + 1] - mat[i][j];
				
				maxArr[i][j]=Math.max(maxArr[i][j],Math.max(maxArr[i+1][j], maxArr[i][j+1]));
			}
		}return maxVAlue;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int mat[][]= new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		System.out.println(specificPair(mat, n));
		System.out.println(specificPairBetter(mat, n));
	}

}
