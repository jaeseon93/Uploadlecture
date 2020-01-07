package co.jessie.lotto;

import java.util.Arrays;

public class LottoGame {
//랜덤으로 값을 추출해야함. 총6개의 번호로 구성되도록.
	/*
	 * mainapp 에서는 금액만 입력 받고 출력하면 끝. 조건1. 입력된 금액만큼 게임 출력 (1게임당 1000원) 조건2. 1행은
	 * 6개의번호로 구성 . 순차적이고 중복수는 존재하지 않음. 조건3. 1페이지 최대 출력수는 5행. 조건4. 게임 번호는 1 ~ 45까지
	 * 랜덤하게 생성됨.
	 */

	public LottoGame() {
	}

	private int money;

	public LottoGame(int money) {
		this.money = money;
	}

	public void randomNumber() {
		int lottoAry[] = new int[6]; // 로또번호를 담을 배열
		for (int i = 0; i < lottoAry.length; i++) { // 랜덤생성
			lottoAry[i] = (int) (Math.random() * 45) + 1; // +1하는이유는 배열1번부터채우기위해.
			for (int j = 0; j < i; j++) { // 중복비교
				if (lottoAry[i] == lottoAry[j]) {
					i--;
				}
			}
//			Arrays.sort(lottoAry); // 순차적으로 정렬하는 구문
		}
		Arrays.sort(lottoAry); // 순차적으로 정렬하는 구문
		for (int i = 0; i < 6; i++) {
			System.out.println(lottoAry[i]);
		}
	}
}