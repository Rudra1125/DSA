package Array;

import java.util.Arrays;

public class medianoftwosortedArrays {

	public static int median(int a[],int b[]) {
		int m=a.length;
		int n=b.length;
		int arr[]=new int[m+n];
		int i=0;
		for(;i<m;i++) {
			arr[i]=a[i];
		}
		for(int j=0;j<n;j++) {
			arr[i]=b[j];
		}
		Arrays.sort(arr);
		int size=arr.length;
		int median=0;
		if(size%2==0) {
			median=(arr[(size/2)]+arr[(size/2)+1])/2;
		}if(size%2!=0) {
			median=arr[(size/2)+1];
		}return median;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-5, 3, 6, 12, 15};
		int b[]= {-12, -10, -6, -3, 4, 10};
		System.out.println(median(a, b));

	}

}
