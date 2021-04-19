package String;

public class ReverseTheString {

	public static void reverseString(char [] s) {
		int n= s.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				char temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
			
		}return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] s= {'h','e','l','l','o'};
		reverseString(s);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
	}

}
