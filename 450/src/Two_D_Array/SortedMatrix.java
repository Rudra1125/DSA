package Two_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {

	//Time Complexity O(N^2logN)
	//Space Complexity O(N^2)
	
	public static void sortedMatrix(int matrix[][] ,int n) {
		int arr[]=new int[n*n];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				arr[k]=matrix[i][j];
				k++;
			}	
		}
		Arrays.sort(arr);
		k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=arr[k];
				k++;
			}
		}return;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		sortedMatrix(arr, n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
