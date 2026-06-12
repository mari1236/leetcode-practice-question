package Phase1;

public class RansomNoteThroughArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "bg"; 
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		int[] count=new int[26];
		
		for(char c: magazine.toCharArray()) {
			count[c-'a']++;
		}
		
		for(char c : ransomNote.toCharArray()) {
			count[c-'a']--;
			if(count[c-'a'] < 0) {
				System.out.println("Magzine letter is not present");
				return;
			}
		}
		System.out.println("Magzine letter present in ranson");

	}

}
