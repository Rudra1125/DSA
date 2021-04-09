package Two_D_Array;

import java.util.Scanner;
import java.util.Stack;

public class MaximumAreaInHistogram {

	public static long maxarea(int [] arr) {
		
		if(arr.length==0) {
			return 0;
		}
		if(arr.length==1) {
			return arr[0];
		}
		int max=0;
		Stack<Integer> st=new Stack<>();
		st.add(0);
		
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			if(curr>=arr[st.peek()]) {
				st.add(i);
			}
			else {
				while(!st.isEmpty() && curr<arr[st.peek()]) {
					int temp=arr[st.pop()];
					if(st.isEmpty()) {
						max= Math.max(max, temp*i);
					}else {
						max=Math.max(max, temp*(i-st.peek()-1));
					}
				}
				st.add(i);
			}
		}
		if(!st.isEmpty()) {
			int i=arr.length;
			while(!st.isEmpty()) {
				int temp=arr[st.pop()];
				if(st.isEmpty()) {
					max= Math.max(max, temp*i);
				}else {
					max=Math.max(max, temp*(i-st.peek()-1));
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();

		}
		System.out.println(maxarea(arr));
	}

}
