package Two_D_Array;

import java.util.Scanner;

public class RotateMatrix90 {

	public static void rotate(int arr[][],int n) {

		for(int i=0;i<n/2;i++) {
			for(int j=i;j<n-1-i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[n-1-j][i];
				arr[n-1-j][i]=arr[n-1-i][n-1-j];
				arr[n-1-j][n-1-j]=arr[j][n-1-i];
				arr[j][n-1-i]=temp;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);

		int n=s.nextInt();
		int arr[][]= new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
				
			}
		}
		rotate(arr, n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
