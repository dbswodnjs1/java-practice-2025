package test.main;

// Mainclass 라는 이름의 클래스 만들기
public class MainClass {

	// main 이라는 이름의 메소드를 클래스 안에 만들기
	public static void main(String[] args) {
		// main() 메소드 안에 있는 코드를 실행하려면 run(▶) 버튼을 누르면 된다.
		System.out.println("Hello, World!");
		System.out.println("Yoon");
		
		
		// 메소드 내부에서 만든 변수는 지역(Local)변수이다.
		// let num=10;
		int num = 10;
		num = 20;
		num = 30;

		double num2 = 10.1;
		num2 = 20.1;

		boolean isRun = true;
		isRun = false;

		String myName = "김구라";
		myName = "해골";

	}
}
