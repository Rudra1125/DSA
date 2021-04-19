package Two_D_Array;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElemntsInAllRows {

	public static ArrayList<Integer> commonElememts(int arr[][],int m,int n){

		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i:arr[0]) {
			if(map.containsKey(i)) {
				continue;
			}else {
				map.put(i,1);
			}
		}
		for(int i=1;i<m;i++) {
			for(int j:arr[i]) {
				if(map.containsKey(j)) {
					int frequency=map.get(j);
					if(frequency==i) {
						map.put(j,frequency+1);
					}
				}
			}
		}
		ArrayList<Integer> output= new ArrayList<Integer>();
		for(int k:map.keySet()) {
			int c=map.get(k);
			if(c==m) {
				output.add(k);
			}
		}
		return output;
	}

	
	public static void main(String[] args) 
	{
		int ar[][]={{1, 2, 1, 4, 8},
	             {3, 7, 8, 5, 1},
	             {8, 7, 7, 3, 1},
	             {8, 1, 2, 7, 9},
	            };
		ArrayList<Integer> output= new ArrayList<>();
		output= commonElememts(ar, 4, 5);
		for(int i=0;i<output.size();i++) {
			System.out.println(output.get(i)+" ");
		}
	}
}
