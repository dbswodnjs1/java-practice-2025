package test.mypac;
/*
 * 필요한 경우 예외 클래스를 직접 정의 해서 해당 예외를 원하는 시점에 발생기켜야 하는 경우도 있다.
 * 
 * 이클래스로 생성한 예외를 발생기키고 싶으면
 * 
 * throw new WowException(예외메세지); 하면 된다.
 */

public class WowException extends RuntimeException {// 1. RuntimeException 을 상속 받는다
	
	//생성자 전달되는 예외 메세지를 부모 생성자에 전달 한다
	public WowException(String msg) {
		super(msg);
	}
}
