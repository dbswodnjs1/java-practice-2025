package test.mypac;
/*
 * only static field
 *       + 
 * only abstract method
 * 
 * 값이 정해지면 변경이 불가
 */

//Remocon r1 = null; 에서  Remocon=> 변수나 필드의 데이터 타입 역할이 능하다
	//인터페이스 추상 메소드만 정의 할 수 있다. abstract 예약어 안붙여도 됨

public interface Remocon {
	
	/*
	 * 필드도 가질수 있지만 static final 만 가능하다
	 * static : static 영역에 Remocon 인터페이스와 같이 만들어 진다
	 * final : 값이 결정된 이후에 변경 불가능(상수화 시킨다)
	 * 생략가능
	 * 
	 */
	
	public String COMPANY = "LG"; //static final 상수는 관례상 필드명을 모두 대문자로
	
			//인터페이스는 주상 메소드만 정의 할 수 있다. abstract 예약이 안붙여도 된다.
	public void up();
	public void down();
	

}
