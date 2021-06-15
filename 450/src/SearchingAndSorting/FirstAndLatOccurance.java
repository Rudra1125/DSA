package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLatOccurance {

	static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> output= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                output.add((long)i);
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                output.add((long)i);
                break;
            }
        }
        if(output.size()==1){
            output.add(output.get(0));
        }else if(output.size()==0){
            output.add((long)-1);
            output.add((long)-1);
        }
        return output;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		long arr[]= new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		int x=s.nextInt();
		ArrayList<Long> res=find(arr, n, x);
		System.out.println(res);
		
	}

}
