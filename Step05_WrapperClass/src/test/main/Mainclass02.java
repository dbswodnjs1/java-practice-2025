package test.main;

public class Mainclass02 {
	
	public static void main(String[] args) {
		//기본 데이터타입 변수 num1
		int num1 = 10;
		//참조 데이터타입 변수 num2
		Integer num2= 10;
		
		//참조 데이터타입 이지만 데이터 타입 처럼 사용 할 수 있다.
		int result1 = num2+1;
		int result2 = num1+num2;
		Integer result3 = num1+num2;
		
	}
}
