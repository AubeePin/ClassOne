package lesson20;

public class chap4_4 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass iroha = new MyClass();
		MyClass teacher = new MyClass();
		
		iroha.myName="이로하";
		teacher.myName="선생님"; 
		
		myClass.hello();
		iroha.hello();
		teacher.hello();

	}

}
