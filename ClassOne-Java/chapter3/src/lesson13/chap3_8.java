package lesson13;

public class chap3_8 {

	public static void main(String[] args) {
		for(int i = 0; i <=9; i++) {
			for(int j = 0; j<=9; j++) {
				//j가 먼저9까지 다돌리면i가 하나추가해서 또 j가 9까지돌리는...
				System.out.println(i+" x "+j+" = " + (i*j));
			}
		}
	}

}
