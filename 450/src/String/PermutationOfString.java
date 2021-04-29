package String;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class PermutationOfString {

	public static ArrayList<String> find_permutation(String S) {
		// Code here

		int n = S.length();
		ArrayList<String> ls = new ArrayList<>();
		return permutation(ls,S,0,n-1);
	}
	public static ArrayList<String> permutation(ArrayList<String> ls, String s, int l, int r)
	{
		if(l==r)
		{
			ls.add(s);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				s = swap(s,l,i);
				permutation(ls,s,l+1,r);
				s = swap(s,l,i);
			}
		}

		Collections.sort(ls);
		return ls;
	}

	//Swap function
	public static String swap(String s, int i, int j)
	{
		char temp;
		char ch[] = s.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		return String.valueOf(ch);
	}  
	
	public static void main(String [] args) {
		String s="ABCD";
		ArrayList<String> output=new ArrayList<>();
		output=find_permutation(s);
		System.out.println(output);
	}
}


