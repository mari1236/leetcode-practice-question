package Phase1;

public class ValidAnagramthroughArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "maria";
		String t = "japla";
		boolean isAnagram = false;
		int[] anagramArray = new int[26];
		if(s.length() != t.length()) return;
		
		for(char c: s.toCharArray()) {
			anagramArray[c-'a']++;
		}
		
		for(char c : t.toCharArray()) {
			anagramArray[c-'a']--;
			if(anagramArray[c-'a'] < 0) {
				System.err.println("not anagram");
				return;
			}
		}
		
		for(int i: anagramArray) {
			if(i != 0) {
				System.err.println("not anagram");
				return;
			}
			else {
				isAnagram = true;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
	
	}

}
