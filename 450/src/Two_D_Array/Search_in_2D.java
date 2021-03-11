package Two_D_Array;

public class Search_in_2D {

	public static boolean searchMatrix(int[][] matrix, int target) {
		int n= matrix[0].length;
		int m=matrix.length;
		for(int i=0;i<m;i++) {
			if(matrix[i][n-1]<target) {
				continue;
			}else {
				int end=n-1;
				int s=0;
				while(s<= end) {
					int mid=(s+end)/2;
					if(target==matrix[i][mid]) {
						return true;
					}else if(target>matrix[i][mid]) {
						s= mid+1;
					}else {
						end=mid-1;
					}
				}

			}
		}

		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1},{3}};
		int target=3;
		System.out.println(searchMatrix(matrix,target));
	}

}
