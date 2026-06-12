package Phase1;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leet code 242 anagram question
		
		HashMap<Character, Integer> anagramMap = new HashMap<Character, Integer>();
		
		String s = "maria";
		String t = "ariam";
		
		if(s.length() != t.length()) {
			return;
		}
	
		for(char c : s.toCharArray()) {
			
			anagramMap.put(c, anagramMap.getOrDefault(c, 0)+1);
		}
		
		for(char c : t.toCharArray()) {
			int available = anagramMap.getOrDefault(c, 0) - 1;
			System.out.println("avaialbe:  " +available);
			if (available < 0) return;
			if(available == 0) anagramMap.remove(c);
			else anagramMap.put(c, available);
			
		}
		
		
		if(anagramMap.isEmpty()) {
			System.out.println("It's anagram");
		}
		else {
			System.out.println("It's not anagram");
		}

	}

}
