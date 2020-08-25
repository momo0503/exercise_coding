package cotest;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //상상 
		int a=0; //1회의 등수
		int b=0;//2회의 등수 
		int a01 =0; //1회상금
		int b01=0; //2회상금
		
		for(int i=1;i<=T;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			
		if(a>22) {
			a01=0;
		}else if(a>15) {
			a01=100000;
		}else if(a>10) {
			a01=300000;
		}else if(a>6) {
			a01=500000;
		}else if(a>3) {
			a01=2000000;
		}else if(a>1) {
			a01=3000000;
		}else {
			a01=5000000;
		}
		
			
		if(b>31) {
			b01=0;
		}else if(a>15) {
			b01=320000;
		}else if(a>7) {
			b01=640000;
		}else if(a>3) {
			b01=1280000;
		}else if(a>1) {
			b01=2560000;
		}else {
			b01=5120000;
		}
			
		System.out.println(a01+b01);
	}//for
	}//main
}