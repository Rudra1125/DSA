package Array;

import java.util.Scanner;

public class RearrangeNegativeAndPositive {

	public static void rearrange(int [] arr) {
		if(arr.length<=1) {
			return;
		}
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]>0) {
				i++;
			}if(arr[j]<0) {
				j--;
			}if(arr[j-1]<0 && arr[j]>=0) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}if(arr[i]<0 && arr[i+1]>=0) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i++;
			}
			
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}System.out.println();
		while(arr[i]>0) {
			++i;
		}
		
		
		int k=0;
		while(i!=arr.length) {
			int temp=arr[i];
			for(j=i;j>k;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
			k+=2;
			i++;
		}	
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		rearrange(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
