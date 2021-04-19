package String;

public class CheckPalindrome {

	 public static int isPlaindrome(String s) {
	        // code here
	        int n=s.length();
	        int i=0;
	        int j=n-1;
	        while(i<j){
	            if(s.charAt(i)==s.charAt(j)){
	                i++;
	                j--;
	            }else 
	                return 0;
	        }
	        return 1;    
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		System.out.println(isPlaindrome(s));
	}

}
