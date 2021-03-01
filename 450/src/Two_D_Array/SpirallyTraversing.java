package Two_D_Array;

import java.util.ArrayList;

public class SpirallyTraversing {

	public static void spirallyTraverse(int [][] arr,int r,int c){
		ArrayList<Integer> output= new ArrayList<Integer>();
		
		int j=0 ,k=0;
		for(int i=0,s=0;i<r&& s<c;i++,s++) {
			for(j=i;j<c-i;j++) {
				System.out.print(arr[k][j]+" ");
			}j=j-1;
			for(k=i+1;k<r-i;k++) {
				System.out.print(arr[k][j]+" ");
			}k=k-1;
			for(j=j-1;j>=s;j--) {
				System.out.print(arr[k][j]+" ");
			}j=j+1;
			for(k=k-1;k>i;k--) {
				System.out.print(arr[k][j]+" ");
			
			}k=k+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1, 2, 3, 4},
						{5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		
		spirallyTraverse(arr, 4, 4);
		
	}

}
