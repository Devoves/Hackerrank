mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H = sc.nextInt();
static boolean flag;

static{
    try{
        if (-100<=B && B<=100 && -100<=H && H<=100){
            if (0<B && 0<H){
            flag = true;
            } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        } else {}
    } catch (Exception e) {}
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
