package Phase1;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LeetCode Question Number : 53 through brute force
		int[] array= {-2,1,-3,4,-1,2,1,-5,4};
		int maxSumArray=0;
		int len=array.length;
		
		for(int i=0;i<len;i++) {
			
			int sum = 0;
			for(int j=i;j<len;j++) {
				sum = sum + array[j];
				if(maxSumArray < sum) {
					maxSumArray = sum;
				}
				System.out.println("Sum: " +maxSumArray);
			}
			
		}
		

	}

}
