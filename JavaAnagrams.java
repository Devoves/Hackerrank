import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
		String aLowerCase = a.toLowerCase();
		String bLowerCase = b.toLowerCase();
		if (aLowerCase.length() != bLowerCase.length()) {
			return false;
		}

		int charRepeatsInFirstLine = 0;
		int charRepeatsInSecondLine = 0;
		for (int i = 0; i < a.length(); i++) {
			char charInFirstWord = aLowerCase.charAt(i);
			charRepeatsInFirstLine = countOccurrences(aLowerCase, charInFirstWord);
			charRepeatsInSecondLine = countOccurrences(bLowerCase, charInFirstWord);
			if (charRepeatsInFirstLine != charRepeatsInSecondLine) {
				return false;
			}
		}
		return true;
	}

	public static int countOccurrences(String stringToLook, char charToCheck) {
		int count = 0;
		for (int i = 0; i < stringToLook.length(); i++) {
			if (stringToLook.charAt(i) == charToCheck) {
				count++;
			}
		}
		return count;
	}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
Complete the function in the editor.
If "a" and "b" are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
*/
