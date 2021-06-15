package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class findPair {

	public static boolean findPair(int arr[],int n,int k) {
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++){
				if(arr[j]-arr[i]==k) {
					return true;
				}
			}
		}return false;
		
	}
	static boolean findPairBetter(int arr[],int n,int k) {
		 Arrays.sort(arr);
			int i=0;
			int j=i+1;
			while(i<n && j<n){
			    
			    if(arr[j]-arr[i]<k){
			        j++;
			    }else if(arr[j]-arr[i]>k){
			        i++;
			        
			    }else if(arr[j]-arr[i]==k){
			        return true;
			    }
			        
			    
			}
			return false;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		System.out.println(findPair(arr, n, k));
		System.out.println(findPairBetter(arr, n, k));
	}

}
