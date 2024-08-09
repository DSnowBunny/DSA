package Arrays;

public class EquillibriumArray {
    
    public int equillibriumIndex(int [] A) {
    	
    	int [] ps = pfsum(A);
    	int leftSum =0;
    	
    	for(int i =0; i<A.length; i++) {
    	if(i>0) {
    		leftSum = ps[i-1];
    	}
    	 
    	 int rightSum = ps[A.length-1]-ps[i];
    	 if(leftSum == rightSum) {
    		 return i;
    	 }
    	
    	}
    	
    	
    	return -1;
       
    }
    
    public int[] pfsum (int [] A) {
    	int [] pfsum = new int [A.length];
    	pfsum[0] = A[0];
    	for(int i =1; i< A.length; i++) {
    		pfsum[i] = A[i] + pfsum[i-1];
    	}
    	return pfsum;
    }
    
    public static void main(String[] args) {
        int [] A = {-7, 1, 5, 2, -4, 3, 0};
        EquillibriumArray s = new EquillibriumArray();
        int res = s.equillibriumIndex(A);
        System.out.println(res); // Output should be 3
    }
}
