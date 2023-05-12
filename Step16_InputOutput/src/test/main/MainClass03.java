package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//문자열을 1줄씩 입력받을 수 있는 객체
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//위의 3줄을 한줄로 표현하면 아래와 같음 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 한줄 입력");
		try {
			//BufferdReader 객체의 readLine()메소드를 이용해서 문자열 한줄을 읽어들이기
			String line = br.readLine();
			System.out.println("line:"+line);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
