/**Lab2
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * Hint: There are 2 well-known ways to solve this problem!
 */
public class Lab2 {
	public static void main(String args[]) {
		
	}
	
	public boolean anagram(String s, String t) {
			s = s.toLowerCase().replaceAll("[^a-z]", "");
			t = t.toLowerCase().replaceAll("[^a-z]", "");
			//countSort s
			//countSort t
			//if s & t have same output Array, return true
			if(s.length() == t.length()) { //only computes if strings have same length
			
				int[] arrayS = new int[s.length()]; //array to hold characters of String s
				int[] countS = new int[26]; //alphabet count for String s
				for(int i = 0; i < arrayS.length; i++) { //fills arrayS with char from String s
					arrayS[i] = s.charAt(i) - 'a';       //decomposing each letter into #'s (0-25) 
													 //counts frequency of numbers from arrayS
					countS[arrayS[i]]++;				 //stores into countS array
				}
			
				int[] arrayT = new int[t.length()]; //array to hold characters of String t
				int[] countT = new int[26]; //alphabet count for String t
				for(int j = 0; j < arrayT.length; j++) { //fills arrayS with char from String t
					arrayT[j] = t.charAt(j) - 'a';       //decomposing each letter into #'s (0-25) 
													 //counts frequency of numbers from arrayT
					countT[arrayS[j]]++;				 //stores into countT array
				}
			
			//compare countS & countT
				for(int k = 0; k < arrayS.length; k++) { //loop invariant can also be bounded by arrayT, because T and S length are equal so either works
					if(countS[k] != countT[k]) {         //find first instance of mismatched numbers in countT and countS arrays
						return false;                    //immediately NOT an anagram
					}
				}
				return true;
			}
		return false; //automatic false, if s and t are different lengths
		}
	
}
