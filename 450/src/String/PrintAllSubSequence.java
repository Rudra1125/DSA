package String;

import java.awt.List;
import java.util.ArrayList;

public class PrintAllSubSequence {
	
	static ArrayList<String> output= new ArrayList<>();
	
	public static void AllSubsequence(String S,String ans) {
		if(S.length()==0) {
			output.add(ans);
			return;
		}
		AllSubsequence(S.substring(1), ans+S.charAt(0));
		AllSubsequence(S.substring(1), ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		AllSubsequence(s,"");
		System.out.println(output);
		
	}

}
