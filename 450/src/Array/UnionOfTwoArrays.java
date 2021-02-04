package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UnionOfTwoArrays {

	public static int union(int[] a,int n,int []b ,int m) {

		//Your code here
		ArrayList<Integer> arr= new ArrayList<>();
		HashMap<Integer,Boolean> map= new HashMap<>();
		for(int i=0;i<n;i++){
			if(map.containsKey(a[i])){
				continue;
			}else{
				arr.add(a[i]);
				map.put(a[i],true);
			}
		}for(int i=0;i<m;i++){
			if(map.containsKey(b[i])){
				continue;
			}else{
				arr.add(b[i]);
				map.put(b[i],true);
			}
		}return arr.size();

	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] a= takeInput(n);
		int m=s.nextInt();
		int [] b=takeInput(m);
		System.out.println(union(a, n, b, m));
	}

	private static int[] takeInput(int n) {
		Scanner s= new Scanner(System.in);
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}return arr;
	}

}
