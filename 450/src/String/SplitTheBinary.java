package String;

public class SplitTheBinary {

	public static int splitBinary(String s) {
		int n=s.length();
		if(n%2!=0) {
			//	System.out.println(-1);
			return -1;
		}
		int count0=0;
		int count1=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='0') {
				count0++;
			}else {
				count1++;
			}
			if(count0==count1) {
				count++;
			}
		}
		if(count1!=count0) {
			return-1;
		}return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0100110101";
		System.out.println(splitBinary(s));
	}

}
