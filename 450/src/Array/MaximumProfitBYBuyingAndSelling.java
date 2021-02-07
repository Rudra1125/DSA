package Array;

import javax.management.MXBean;

public class MaximumProfitBYBuyingAndSelling {

	public static int maximumProfit(int prices[]) {
		int n=prices.length;
		int[] profit=new int [n];
		profit[0]=0;
		for(int i=1;i<n;i++) {
			
			profit[i]=Math.max(profit[i-1], profit[i-1]+(prices[i]-prices[i-1]));
			
		}return profit[n-1];
	}
	
	public static int maximumProfitO_1(int prices[]) {
		int n=prices.length;
		int profit=0;
		for(int i=1;i<n;i++) {
			int diff=prices[i]-prices[i-1];
			if(diff>0) {
				profit+=diff;
			}
		}return profit;
	}
	
	public static int maximumProfitO_n(int price[]) {
		int n=price.length;
		int profit[]= new int[n];
		for(int i=0;i<n;i++) {
			profit[i]=0;
			
		}
		int max=price[n-1];
		for(int i=n-2;i>=0;i--) {
			if(max<price[i]) {
				max=price[i];
			}
			profit[i]=Math.max(profit[i+1], (max-price[i]));
		}
		int min=price[0];
		for(int i=1;i<n;i++) {
			if(min>price[i]) {
				min=price[i];
			}
			profit[i]=Math.max(profit[i-1], profit[i]+(price[i]-min));
		}
		return profit[n-1];
	}
	
	public static void main(String[] args) {
		int arr[]= {10,22,5,75,65,80};
		System.out.println(maximumProfitO_n(arr));
		System.out.println(maximumProfitO_1(arr));
		System.out.println(maximumProfit(arr));
	}

}
