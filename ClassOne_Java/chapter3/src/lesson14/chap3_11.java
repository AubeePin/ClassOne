package lesson14;//반환값만 있는 메소드

import java.util.Random;

public class chap3_11 {

	public static void main(String[] args) {
		int d = dice(); //메소드를 호출해서 변수에 반환된 주사위눈을 넣는다.
		System.out.println("주사위는 " + d); //결과 표시

	}
	static int dice() {
		Random rnd = new Random(); //주사위 눈을 반환하는 메소드
		int ans = rnd.nextInt(6);
		return ans;
	}
}
