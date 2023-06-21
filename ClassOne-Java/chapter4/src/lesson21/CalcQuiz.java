package lesson21;

import java.util.Random;

class CalcQuiz{ //클래스
	String question;//문제낼 필드
	String answer;//답을저장할 필드
	
	CalcQuiz() { //생성자
		createQuestion();
	}
	void createQuestion() {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);
		question = a + " x " + b + " = ?";
		answer = Integer.toString(a*b);
		
	}
	
	String getQuestion() {
		return question;
	}
	String getAnswer() {
		return answer;
	}
}