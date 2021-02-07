package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfArray {

//	public static int [] takeinput(int n){
//		int [] arr=new int [n];
//		try (Scanner s = new Scanner(System.in)) {
//			
//			for(int i=0;i<n;i++){
//				arr[i]=s.nextInt();
//			}
//			
//		}return arr;
//
//	}

	public static boolean binarySearch(int arr[],int x,int s,int e){
		if(e>=s){
			int mid=(s+e)/2;
			if(x==arr[mid]){
				return true;
			}else if(x>arr[mid]){
				return binarySearch(arr,x,mid+1,e);
			}else if(x<arr[mid]){
				return binarySearch(arr,x,0,mid-1);
			}

		}return false;
	}

	public static void main (String[] args)
	{
		//code

		try (Scanner s = new Scanner(System.in)) {
			int cases=s.nextInt();
			while(cases-->0){
				int m=s.nextInt();
				int n=s.nextInt();
				int [] a=new int[m];
				for(int i=0;i<m;i++) {
					a[i]=s.nextInt();
				}
				int [] b=new int[n];
				for(int i=0;i<n;i++) {
					b[i]=s.nextInt();
				}
				Arrays.sort(a);
				boolean ans=false;
				for(int i=0;i<n;){
					ans=binarySearch(a,b[i],0,m-1);
					if(ans==false){
						System.out.println("No");
						break;
					}i++;
				}
				if(ans==true){
					System.out.println("Yes");
				}

			}
		}

	}
}
