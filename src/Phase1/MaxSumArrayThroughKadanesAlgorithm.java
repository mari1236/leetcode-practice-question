package Phase1;

public class MaxSumArrayThroughKadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LeetCode Question Number : 53 through Kadanes's Algorithm
		// According to this Algorithm:
		// +ve,+ve = +ve
		// large+ve, min-ve = +ve
		// large -ve,min +ve = -ve
		// According to algo if value is negative reset to zero
		
		int[] array= {-2,1,-3,4,-1,2,1,-5,4};
		int maxSumArray=Integer.MIN_VALUE;
		int len=array.length;
		int currentSum = 0;
		
		for(int i=0;i<len;i++) {
			currentSum = currentSum + array[i];
		
			if(currentSum > maxSumArray) {
				maxSumArray = currentSum;
			}
			if(currentSum < 0) {
				currentSum = 0;
			}
		}
		System.out.println("Max Sum Array"+maxSumArray);


	}

}
