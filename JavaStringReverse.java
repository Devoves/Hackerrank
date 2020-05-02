import java.io.*;
import java.util.*;

public class JavaStringReverse {
    
	/**
	 * Given a string A, print Yes if it is a palindrome (the direction of reading
	 * the word do not change the meaning of it), print No otherwise.
	 */

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		boolean same = true;

		for (int i = 0; i < A.length() / 2; i++) {
			if (A.substring(i, i + 1).equals(A.substring(A.length() - i - 1, A.length() - i))) {
				same = true;
			} else {
				same = false;
				System.out.println("No");	
				break;
			}
		}
		
		if (same) {
			System.out.println("Yes");
		}
    }
}

/*
https://www.hackerrank.com/challenges/java-string-reverse/problem
*/
