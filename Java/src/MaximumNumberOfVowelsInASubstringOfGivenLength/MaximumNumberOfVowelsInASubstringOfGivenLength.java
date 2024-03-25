package MaximumNumberOfVowelsInASubstringOfGivenLength;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
	static public int maxVowels(String s, int k) {
		Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;
		for(int i = 0; i < k; i++) {
			if(vowels.contains(s.charAt(i)))
				count++;
		}
		if(count == k)
			return count;
		int maxCount = count;
		for(int i = k; i < s.length(); i++) {
			if(vowels.contains(s.charAt(i - k)))
				count--;
			if(vowels.contains(s.charAt(i)))
				count++;
			if(count > maxCount)
				maxCount = count;
		}
		return maxCount;
	}
}
