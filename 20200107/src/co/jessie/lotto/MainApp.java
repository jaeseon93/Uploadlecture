package co.jessie.lotto;

import java.util.Scanner;

public class MainApp {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	 LottoGame lg = new LottoGame(); 
	 lg.randomNumber();
	 
     System.out.println("금액을 입력하세요.");
     System.out.println("금액> ");
     int money = sc.nextInt();
		
	}

}
