package lesson15;

import java.util.Random;

public class chap3_14 {

	public static void main(String[] args) {
		luckytest();

	}

	static void luckytest() {
		String[]jebi= {"행운","좋음","보통","조심","나쁨"};
		Random rnd = new Random();
		int id = rnd.nextInt(jebi.length);
		System.out.println(jebi[id]);
		
	}

}
