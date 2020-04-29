import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
                String min = null, max = null;
        for(int i=0; i+k<=s.length(); i++){
            String sub = s.substring(i,k+i);
            System.out.println("iteration " + i + " the length is " + s.length());
            System.out.println(sub);
            if(min == null || min.compareTo(sub) > 0){
                
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
