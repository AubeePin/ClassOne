package lesson14;//인수와 반환값이 모두 있는 메소드

public class chap3_12 {

	public static void main(String[] args) {
		double ans = postTaxPrice(980);
		System.out.println(ans +"원");
	}
	static double postTaxPrice(int price) {
		double ans =price*1.08;
		return ans;
	}
}
