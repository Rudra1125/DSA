package Array;

import java.util.HashSet;
import java.util.Scanner;

public class SumOfSubSet0 {

	static boolean findsum(int arr[],int n)
    {
        //Your code here1
        HashSet<Integer> map=new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0 || arr[i]==0 || map.contains(sum)){
                return true;
            }
            map.add(sum);
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}System.out.println(findsum(arr, n));
	}

}
