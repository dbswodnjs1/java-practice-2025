package test.main;

import test.util.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		// static 필드 참조
		String a = MyUtil.version;
		// static 메소드 호출
		MyUtil.send();
		/*
		 * static 영역
		 * 
		 * static 예약어를 붙여서 선언한 필드나 메소드는 클래스와 함께 static 영역에 만들어진다 static 영역은 heap 영역 처럼
		 * 참조값으로 찾아가는것이 아니고 클래스명으로 찾아간다.
		 * 
		 * versoin 필드참조 => MyUtil.version send 메소드 호출 => MyUtil.send()
		 * 
		 * ----------------------------------------------------
		 * 
		 * heap 영역
		 * 
		 * new MyUtil() 을 해야 객체를 생성해서 내용을 넣을 수 있음
		 * 
		 * 
		 */

		
		MyUtil u1= new MyUtil();
		u1.owner="김구라";
		
		MyUtil u2= new MyUtil();
		u2.owner="해골";
		
		System.out.println(u1.owner);
		System.out.println(u2.owner);
	}

}
