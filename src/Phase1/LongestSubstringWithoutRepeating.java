package Phase1;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LeetCode Question Number: 3
		
		String s = "qrsvbspk";
		char[] updatedArry = s.toCharArray();
		String sum = "";
		int left=0;
		int maxLength = 0;
		HashSet<Character> uniqueString = new HashSet<Character>();
		
		for(int i= 0;i<s.length();i++) {
			
			
				while(uniqueString.contains(s.charAt(i))) {
					uniqueString.remove(s.charAt(left));
					left++;
				}
				uniqueString.add(s.charAt(i));
				if(maxLength < uniqueString.size()) {
					maxLength = uniqueString.size();
				}
				
				
				
			
		}
		System.out.println("Unique String: "+maxLength);
		
		
		

	}

}
