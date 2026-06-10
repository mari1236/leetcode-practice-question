package Phase1;

import java.util.HashMap;

public class ContainDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LeetCode Question number 217
		
		HashMap<Integer, Integer> isContainDuplicate = new HashMap<>();
		int[] nums = {1,2,3,1};
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("keyyy: "+isContainDuplicate.containsKey(nums[i]));
			if(isContainDuplicate.containsKey(nums[i])) {
				System.out.println("Duplicated Present");
				return;
			}
			else {
				isContainDuplicate.put(nums[i], i);
			}
			
		}


	}

}
