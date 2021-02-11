package Array;

import java.util.Arrays;
import java.util.Scanner;

class TripletSum
{
	// arr[] : The input Array
	// N : Size of the Array
	// X : Sum which you need to search for 
	static Scanner s= new Scanner(System.in);
	public static int find3Numbers(int arr[], int N, int X) { 

		// Your code Here
		Arrays.sort(arr);
		for(int i=0;i<N;i++){
			int j=i+1;
			int k=N-1;

			while(j<k){

				if(arr[i]+arr[j]+arr[k]==X){
					return 1;
				}else if(arr[i]+arr[j]+arr[k]<X){
					j++;
				}else if(arr[i]+arr[j]+arr[k]>X){
					k--;
				}
			}

		}return 0;
	}


	public static int [] takeinput(int n) {
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int N= s.nextInt();
		int [] arr= takeinput(N);
		int X=s.nextInt();
		System.out.println(find3Numbers(arr, N, X));
	}

}
