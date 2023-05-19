package test.main;

import java.util.Scanner;

public class MainClass19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul = scan.nextInt();
		for(int i=1; i<10; i++) {
			int result = mul * i;
			System.out.println(mul+"x"+i+"="+result);
		}
		
	}
}
