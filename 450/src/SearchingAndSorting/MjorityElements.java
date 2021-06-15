package SearchingAndSorting;

import java.util.Scanner;

public class MjorityElements {

	
	 static int findMajority(int []arr,int n){
	        int count=1;int maj_index=0;
	        for(int i=1;i<n;i++){
	            if(arr[i]==arr[maj_index]){
	                count++;
	            }else{
	                count--;
	            }if(count==0){
	                maj_index=i;
	                count=1;
	            }
	        }return arr[maj_index];
	    }
	    
	    static boolean isMajority(int []arr,int n,int can){
	        int count=0;
	        for(int i=0;i<n;i++){
	            if(arr[i]==can){
	                count++;
	            }
	        }
	        if(count>n/2){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    static int majorityElement(int a[], int n)
	    {
	        // your code here
	        int can=findMajority(a,n);
	        if(isMajority(a,n,can)){
	            return can;
	        }else{
	            return -1;
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.println(majorityElement(arr, n));
		
	}

}
