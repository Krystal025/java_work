package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일 Copy 연습
 */
public class MainClass08 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("C:\\acorn202304\\myFolder\\copied.jpg");
			//반복문 돌면서
			while(true) {
				int readedByte = fis.read();
				System.out.println(readedByte);
				//1byte씩 읽어들이고
				if(readedByte == -1) break;
				//읽은 1byte를 출력하기 
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 copy했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			}catch(Exception e) {}
		}
	}
}
