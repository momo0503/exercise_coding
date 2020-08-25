package cotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {

public static void main(String[] args) throws Exception{
	
	Scanner sc= new Scanner(System.in);
	 
	int n =sc.nextInt();

	   for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
             
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

	sc.close();
	System.out.println("rkskekfk");
	System.out.println("rkskekfk");
	System.out.println("fetch 후 코드 수정후 push 해보기");
}
}
