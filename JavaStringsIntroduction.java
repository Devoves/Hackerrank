import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aBLength = A.length() + B.length();
        System.out.println(aBLength);
        int compare = A.compareTo(B);
        if (compare > 0){
            System.out.println("Yes");
        } else {
        System.out.println("No");
        }
        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}

/*
https://www.hackerrank.com/challenges/java-strings-introduction/problem
Practice
Java
Strings
Java Strings Introduction
*/
