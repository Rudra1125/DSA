package String;

public class StringRotation {

	public static boolean areRotations(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}else if(s1==null || s2==null) {
			return true;
		}
		else {			
			String temp=s1+s1;
			if(temp.contains(s2)) {
				return true;
			}
		}



		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCD";
		String s2="CDAB";
		System.out.println(areRotations(s1, s2));
	}

}
