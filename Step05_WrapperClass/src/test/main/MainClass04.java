package test.main;

import java.io.InputStream;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소스가 시작 됩니다.");
		
		//콘솔창으로 부터 입력 받을수 있는 Scanner 객체 생성
		InputStream is = System.in;
		Scanner scan1 = new Scanner(is);
		
		Scanner scan2 = new Scanner(System.in);
		//.print() 는 개행기호를 출력하지 않는다.
		System.out.print("문자를 입력:");
		
		//콘솔에 입력한 문자열을 String type 으로 얻어낸다.
		String str = scan1.nextLine();//콘솔창에 문자열을 입력하고 엔터를 입력해야 .nextLine()메소드가 리턴한다.
		                              //엔터를 입력하기 전까지 실행의 흐름이 blocking 되어 있다. 

		
		System.out.println("main 메소스가 종료 됩니다.");
		
		
		
	}

}
