//이 클래스가 속해 있는 패키지 명시하기(없으면 에러)
package test.main; 
//클래스 안에서 사용하는 다른 클래스나 인터페이스 import

public class TestMain {// 클래스의 범위를 나타내는 중괄호"시작"
	/*
	 * 클래스안에 무언가를 정의 할 때는 클래스 안에 속해 있다는 의미해서 들여 쓰기 한다
	 * 클래스 안에 정의할수  있는 것은:
	 * 
	 * 1. 필드, static 필드
	 * 2. 메소드 , static메소드
	 * 3. 생성자
	 * 4. 또다른 생성자(Inner class)
	 * 5. 순서가 정해진것은 아니지만 보통 
	 *     필드=> 생성자=> 메소드 순으로 정의한다.
	 */
	
	//필드
	public String name = "김구라";
	//static 필드
	public static String yourname= "해골";
	
	//생성자(메소드와 달아 있지만 return type 이 없고 클래스명과 동일해야 한다).
	
	public TestMain() {
		//여기는 생정사 내부 (생성자 내부라는 의미해서 들여쓰기를 한다.)
		//어디에선가 new TestMiain() 해서 객체를 생성하면 여기가 실행 된다.
		System.out.println("TestMain 호출");
		//생성자 안에도 지역변수를 만들수 있다.
	}
	
	//메소드
	public void test() {
		//여기는 메소드 내부(메소드 내부라는 의미해서 들여쓰기를 한다).
		//어디에선가 이클래스(TestMiain) 으로 생성한 객체의 test() 메소드를 호출하면 여기가 실행 된다.
		System.out.println("test() 호출");
		//메소드 안에는 지역변수를 만들수 있다.(메소드는 만들수 없음)
	}
	
	//static 메소드
	public static void doSomething() {
		//어디에선가 클래스옆에  . 을 찍어서  호출하는 TestMain.doSomething() 으로 호출 할 수 있다.
		System.out.println("doSomething() 호출");
	}
	
	// run 했을 때 (application) 실행의 흐름이 시작되는 아주 특별한 main 메소드
	public static void main(String [] arg) {
		//application 의 동작을 여기서 준비한다. 
		//객체 생성이나, 반복문, 에소드 호출 등등을 여기서 연습을 하고 있는 중
	}
	
	
	
	
}//클래스의 행위를 나타내는 중괄호 "끝"
