package Arrays;

public class maxSumContiguousSubarray {

	public int sum (int [] A) {
		int res = Integer.MIN_VALUE;
		int sum =0;
		for(int i =0; i<A.length; i++) {
			 sum = sum+A[i];
			 res = Math.max(res, sum);
			 if(sum<0) {
				 sum=0;
			 }
		}
		return res;
	}
	public static void main(String[] args) {
		   int [] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        maxSumContiguousSubarray s = new maxSumContiguousSubarray();
	        int res = s.sum(A);
	        System.out.println(res);

	}

}
