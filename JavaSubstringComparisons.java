import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		//s = s.toLowerCase();      in case you want it to be non-case sensitivity
		
		for (int i = 0; i + k <= s.length(); i++) {
			String sub = s.substring(i, k + i);
			if (smallest == "" || smallest.compareTo(sub) > 0) {
				smallest = sub;
			}
			if (largest == "" || largest.compareTo(sub) < 0) {
				largest = sub;
			}
		}
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
https://www.hackerrank.com/challenges/java-string-compare/problem
*/
