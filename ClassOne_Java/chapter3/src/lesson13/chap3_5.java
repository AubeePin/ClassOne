package lesson13;

import java.util.Random;

public class chap3_5 {

	public static void main(String[] args) {
		Random rnd = new Random(); // 랜덤한 값을 만드는 부품
		int answer = rnd.nextInt(10); // 곱하는 수
		String question=""; //문제 문자열
		for(int i = 0; i <=9; i++) {
			//문제 변수에 [answer * i]를 계속 추가합니다.
			question = question + "["+(answer * i) +"]";
		}
		System.out.println("구구단 몇 단 일까요?");
		System.out.println(question);
		System.out.println("정답 : " + answer);
	}

}
