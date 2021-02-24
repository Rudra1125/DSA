package Array;

public class SmallestSubarray {

	public static long sb(int a[],int n,int x) {
		int countmax=0;
		for(int i=0;i<n;i++) {
			int count=0;
			int sum=0;
			int j=i;
			if(a[i]>x) {
				return 1;
			}
			while(sum<=x && j<n) {
				sum+=a[j];

				count+=1;
				j+=1;
			}
			System.out.println(count);
			if(sum>x) {
				if(countmax==0) {
					countmax=count;
				}countmax=Math.min(count, countmax);
			}
			
		}return countmax;
	}

	public static void main(String[] args) {
		int arr[]= {1,4 ,45 ,6 ,0, 19};
		int n=arr.length;
		System.out.println(sb(arr, n, 51));
	}

}
