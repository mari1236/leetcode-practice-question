package Phase1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leetCode Question 1
		
		int[] nums = {2,7,11,15}; 
		int target = 9;
		int sub;
		HashMap<Integer, Integer> targetFinder = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		System.out.println("JJJ");
		
		for(int i=0;i<nums.length;i++) {
			
			sub = target - nums[i];
			
			if(targetFinder.containsKey(sub)) {
				System.out.println("hey"+sub);
				System.out.println("he1"+nums[i]);
				result.add(targetFinder.get(sub));
				result.add(i);
				break;
				
			}
			else {
				targetFinder.put(nums[i], i);
			}
			
			
			
		}
		System.out.println("List: " +result);

	}

}
