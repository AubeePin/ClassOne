package lesson14; //인수만 있는 메소드 ->다른데이터를 넘겨주고 처리를 조정하고싶을때

public class chap3_10 {

	public static void main(String[] args) {
		sayhello2("이로하"); //인사말을 표시하는 메소드 호출
		sayhello2("늑대선생");
	}
	static void sayhello2(String name) {//이름을 붙여 인사하는 메소드
		System.out.println("안녕하세요 "+ name+"님");
	}
}
