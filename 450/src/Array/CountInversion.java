package Array;

public class CountInversion {



	public static long inversionCount(long [] arr,long n) {
		long temp[]= new long[(int)(n)];

		return mergesort(arr,temp,0,n-1);
	}

	private static long mergesort(long[] arr, long[] temp, long left, long right) {
		long invCount=0;
		if(right>left) {
			long mid=(left+right)/2;

			invCount=mergesort(arr, temp, left, mid);
			invCount+=mergesort(arr, temp, mid+1, right);
			invCount+=merge(arr, temp, left, mid, right);
		}
		return invCount;
	}

	private static long merge(long [] arr,long[] temp,long left,long mid,long right) {
		long ivCount=0;
		long i=left;
		long j=mid;
		long k=left;
		while(i<= mid-1 && j<=right) {
			if(arr[(int)i]<=arr[(int)j]) {
				temp[(int)(k++)]=arr[(int)(i++)];
			}else {
				temp[(int)(k++)]=arr[(int)(j++)];
				ivCount=ivCount+(mid-i);
			}
		}
		while(i<=mid-1) {
			temp[(int)(k++)]=arr[(int)(i++)];;
		}
		while(j<=right) {
			temp[(int)(k++)]=arr[(int)(j++)];
		}
		for(i=left;i<=right;i++) {
			arr[(int)i]=temp[(int)i];
		}
		return ivCount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[]= {468, 335 ,1, 170 ,225, 479 ,359 ,463 ,465 ,206 ,146 ,282 ,328 ,462 ,492 ,496, 443, 328 ,437 ,392 ,105 ,403 ,154, 293, 383, 422, 217 ,219 ,396 ,448 ,227 ,272 ,39 ,370, 413, 168 ,300 ,36 ,395, 204, 312, 323};
		System.out.println(inversionCount(arr, arr.length));
	}

}
