package Array;

public class RotateArrayBy1 {

	public static void rotateArrayBy1(long arr[],long n) {

		long x =arr[(int) (n-1)];
		for(long i=n-1;i>0;i--){
			arr[(int) (i-1)]=arr[(int) i];
		}
		arr[0]=x;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
