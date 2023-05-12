package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		//콘솔창과 연결된 객체의 참조값
		PrintStream ps = System.out;
		//OutputStream도 1byte처리 스트림이다 (한글처리 불가)
		OutputStream os = ps; //학습을 위해 부모type으로 변수에 참조값을 넣어두고 사용
		try {
			os.write(97); 
			os.flush();//방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
