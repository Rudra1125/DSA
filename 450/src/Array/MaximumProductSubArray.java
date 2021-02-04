package Array;

public class MaximumProductSubArray {

	public static int product(int arr[], int n) {
		
		int minValue=arr[0];
		int maxValue=arr[0];
		
		int maxProduct=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<0) {
				int temp=maxValue;
				
				maxValue=minValue;
				minValue=temp;
				
			}
			maxValue=Math.max(arr[i], maxValue*arr[i]);
			minValue=Math.min(arr[i], arr[i*minValue]);
			
			maxProduct=Math.max(maxProduct,maxValue);
		}
		return maxProduct;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
