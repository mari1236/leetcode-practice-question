package Phase1;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ransomNote = "bg"; 
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		
		HashMap<Character, Integer> magzineLetters = new HashMap<Character, Integer>();
		
		for(char c : magazine.toCharArray()) {
			
			magzineLetters.put(c,magzineLetters.getOrDefault(magzineLetters, 0)+1);
			
		}
		
		for(char c : ransomNote.toCharArray()) {
			int available= magzineLetters.getOrDefault(c, 0);
			if(available == 0) {
				System.out.println("Not Match");
				return;
			}
			
			magzineLetters.put(c, available-1);
			
		}
		System.out.println("Match");
		
	
	}

}
