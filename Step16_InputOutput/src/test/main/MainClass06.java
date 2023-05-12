package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//좀 더 좋은 기능을 가지고있는 BufferedWriter 객체 사용		
		BufferedWriter bw = new BufferedWriter(osw);
		try {
			bw.write("하나\r\n");
			bw.write("두울");
			bw.newLine(); //개행기호를 출력해주는 메소드
			bw.write("세엣");
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
