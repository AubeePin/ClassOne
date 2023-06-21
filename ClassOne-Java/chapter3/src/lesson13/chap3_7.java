package lesson13;

public class chap3_7 {

	public static void main(String[] args) {
		int[] scorelist = {64, 100, 78, 80, 72}; //배열
		int total = 0; //0으로 초기화 한다.
		for(int i: scorelist) { //for문으로 반복한다.
			total+=i; //토탈에 반복한 i를 집어넣는다.
		}
		System.out.println(total); // 변수 토탈의 값을 표시한다.
	}

}
