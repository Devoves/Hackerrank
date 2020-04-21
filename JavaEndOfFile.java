import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; sc.hasNext(); i++){
            System.out.print(i + " ");
            System.out.println(sc.nextLine());
        }
    }
}

/*
https://www.hackerrank.com/challenges/java-end-of-file/problem
*/
