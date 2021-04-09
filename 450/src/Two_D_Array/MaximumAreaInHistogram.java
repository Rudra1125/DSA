package Two_D_Array;

import java.util.Scanner;
import java.util.Stack;

public class MaximumAreaInHistogram {

	public static long maxarea(int [] arr) {
		
		//check the array is empty
		//or of size one return according to that
		if(arr.length==0) {
			return 0;
		}
		if(arr.length==1) {
			return arr[0];
		}
		
		//taking a stack to remember the height of previous bar so we dont have to traverse the same array multiple times
		int max=0;
		Stack<Integer> st=new Stack<>();
		st.add(0);
		
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			//if current element is greater than that of the previous element then we just add the index of the array to the stack 
			//and move forward until we  get a smaller bar .. 
			
			if(curr>=arr[st.peek()]) {
				st.add(i);
			}
			else {
				
				// to get the smaller bar we just POP out the element from the stack until the stack is empty or we found a smaller bar.  
				//we will calculate the area 
				
				while(!st.isEmpty() && curr<arr[st.peek()]) {
					int temp=arr[st.pop()];
					if(st.isEmpty()) {
						// in case of empty we will just multiply with index of i and height of that bar which was poped out last
						
						max= Math.max(max, temp*i);
					}else {
						
						// otherwise we will check the difference between them and multiply with current bar
						max=Math.max(max, temp*(i-st.peek()-1));
					}
				}
				st.add(i);
			}
		}
		
		//if the stack is not get empty we will just repeat the same process to calculate the area 
		// return the maximum area
		//this the case when our height array is like 1,2,3,4,5,...
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
