package Array;

import java.util.HashMap;

public class CountPairs {

	static int getPairsCount(int[] arr, int n, int k) {
		// code here
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++){
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],0);
			}
			map.put(arr[i], map.get(arr[i])+1);
			
			
		}
		int twiceCount=0;
		for(int i=0;i<arr.length;i++) {
			if(map.get(k-arr[i])!=null) {
				twiceCount+=map.get(k-arr[i]);
			}

			if(k-arr[i]==arr[i]) {
				twiceCount--;

			}
			return twiceCount/2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
