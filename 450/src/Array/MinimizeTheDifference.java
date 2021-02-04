package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class pair{
	private int value;
	private int indices;
	
	pair(int value, int indices){
		this.setValue(value);
		this.setIndices(indices);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getIndices() {
		return indices;
	}

	public void setIndices(int indices) {
		this.indices = indices;
	}
	
}

public class MinimizeTheDifference {

	public static int minimizeTheDifference(int[] arr,int n,int k) {
		ArrayList<pair> a=new ArrayList<>();
		int [] visited= new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]-k>0) {
				a.add(new pair (arr[i]-k,i));
			}a.add(new pair(arr[i]+k,i));
			visited[i]=0;
		}Collections.sort(a,new Comparator<pair>() {
			public int compare(pair p1,pair p2) {
				return p1.getValue()-p2.getValue();
			}
		});
		int ele=0;
		int left=0,right=0;
		int size=a.size();
		while(right<size) {
			if(visited[a.get(left).getValue()]==1) {
				ele--;
			}visited[a.get(left).getValue()]--;
			left++;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		System.out.println(minimizeTheDifference(arr, n, k));
	}

}
