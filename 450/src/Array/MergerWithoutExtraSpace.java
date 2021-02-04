package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergerWithoutExtraSpace {

	public static void merge(int arr1[],int arr2[],int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]<arr2[j]) {
					break;
				}else {
					int temp=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=temp;
		//			Arrays.sort(arr2);
				}
			}
		}
	}
	
	public static int[] takeinput(int n) {
		Scanner s= new Scanner(System.in);
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}return arr;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m=s.nextInt();
		int []a= takeinput(n);
		int []b= takeinput(m);
		merge(a, b, n, m);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+ " ");
			
		}
		for(int i=0;i<m;i++) {
			System.out.print(b[i]+" ");
			
		}
	}

}
