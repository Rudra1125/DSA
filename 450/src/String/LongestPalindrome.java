package String;

public class LongestPalindrome {

	public static String longestPalin(String s) {
		if(s.length()==1) {
			return s;
			
		}
		if(s.length()==2) {
			if(s.charAt(0)==s.charAt(1)) {
				return s;
			}
		}int start=0;
		int maxLength=1;
		int n=s.length();
		boolean dp[][]= new boolean[s.length()][s.length()];
		for(int i=0;i<n;i++) {
			dp[i][i]=true;
			
		}
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			dp[i][i]=true;
			if(s.charAt(i)==s.charAt(j)) {
				dp[i][j]=true;
				start=i;
				maxLength=2;
			}
		}
		for(int k=3;k<=n;++k) {
			
			for(int i=0;i<n-k+1;++i) {
				
				int j=i+k-1;
				
				if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true) {
					dp[i][j]=true;
					
					if(k>maxLength) {
						maxLength=k;
						start=i;
					}
				}
			}
		}
		System.out.println(maxLength);
		return s.substring(start, start+maxLength);
	//	return maxLength;
		
		
	}
	
	public static String lps(String s) {
		  int n=s.length();
	       int maxlength =1;
	       int start =0;
	       int low,high;
	       
	       for(int i=1;i<n;i++){
	            low=i-1;
	            high=i;
	           while((low>=0 && high<n) &&( s.charAt(low)==s.charAt(high))){
	               if(high-low+1>maxlength ){
	                   start=low;
	                   maxlength=high-low+1;
	               }
	               --low;
	               ++high;
	           }
	            low = i - 1;
	            high = i + 1;
	            while (low >= 0 && high < n
	                   && s.charAt(low)
	                          == s.charAt(high)) {
	                if (high - low + 1 > maxlength) {
	                    start = low;
	                    maxlength = high - low + 1;
	                }
	                --low;
	                ++high;
	            }
	        }
	        return s.substring(start,start+maxlength);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rfkqyuqfjkxy";
		System.out.println(longestPalin(s));
		System.out.println(lps(s));
	}

}
