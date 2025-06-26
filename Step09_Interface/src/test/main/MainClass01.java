package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		// 인터페이스는 data type 의 역할도 할 수 있다.
		MyRemocon r1 = null;

		// 인터페이스 단독으로는 생성 불가
		// Remocon r2 = new Remocon(); // 오류

		// 인터페이스를 구현한 클래스를 이용해서 객체 생성
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		
		//인터페이스가 가지고 있는 상수 참조(static final)
		String a = Remocon.COMPANY; //"LG"
	}
}