import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s == null || s.trim().equals("")) {
			System.out.println("0");
		} else {
			String[] parts = s.trim().split("[^a-zA-Z0-9]+");
			System.out.println(parts.length);
			for (int i = 0; i < parts.length; i++) {
				String word = parts[i];
				System.out.println(word);
			}
		}
		scan.close();
    }
}

/*
https://www.hackerrank.com/challenges/java-string-tokens/problem
*/
