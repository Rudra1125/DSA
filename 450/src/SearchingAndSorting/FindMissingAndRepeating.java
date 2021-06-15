package SearchingAndSorting;

import java.util.Scanner;

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int out[]=findtwonumbers(arr,n);
		System.out.println();
		System.out.println(out[0]+" "+out[1]);
	}

	private static int[] findtwonumbers(int[] arr, int n) {
		int res[]=new int[2];
		for(int i=0;i<n;i++) {
			arr[i]-=1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			arr[arr[i]%n]+=n;
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			arr[i] /= n;
            
            if(arr[i] == 2)
            {
                res[0] = i + 1;
            }
            
            if(arr[i] == 0)
            {
                res[1] = i + 1;
            }
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		return res;
	}

}
