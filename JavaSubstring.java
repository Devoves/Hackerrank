import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}

/*
https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen
Practice
Java
Strings
Java Strings Introduction
*/
