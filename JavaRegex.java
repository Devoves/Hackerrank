import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
	
	/*
	 * Checks whether a number is in range 0-255, 00-255 OR 000-255
	 */
	String partOfIP = "([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])";
	String dotInIP = "\\.";
	String pattern = partOfIP + dotInIP + partOfIP + dotInIP + partOfIP + dotInIP + partOfIP;
}


/*
https://www.hackerrank.com/challenges/java-regex/problem
*/
