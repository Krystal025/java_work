package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import test.mypac.Lotto;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("로또를 몇개 구입하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int userNum = scan.nextInt();
		
		Random ran = new Random();
		int ranNum = ran.nextInt(1, 45);
		
		List<Lotto> numbers = new ArrayList<>();
		
		
		System.out.println(ranNum);
		
	}
}
