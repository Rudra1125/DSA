package String;

import java.util.Scanner;

public class CountAndSay {

	public static String countSay(int n){
		if(n==0) {
			return "";
		}
		String result="1";
		for(int i=0;i<n-1;i++) {
			char c=result.charAt(0);
			StringBuilder s= new StringBuilder();
			int count =1;
			for(int j=1;j<result.length();j++) {
				if(c!=result.charAt(j)) {
					s.append(count);
					s.append(c);
					count=0;
					c=result.charAt(j);
				}
				count++;
			}
			s.append(count);
			s.append(c);
			result=s.toString();
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str= countSay(n);
		System.out.println(str);
	}

}
