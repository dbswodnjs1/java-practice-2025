package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * i라는 변수를 만들고 초기값 0 대입
		 * i가 10보다는 작은 동안에 반복한다(작으면 for문 블럭을 실행한다.)
		 * i를 1씩 증가 시키면서 
		 * i는 for문 안에서 만들어진 지역변수(for문이 종료되면 i는 사라진다.)
		 * 
		 */
		for(int i=0; i<10; i++) {
			System.out.println(i);
			// int i=0 최초 한번 실행
			//i++증가,10보다 크지 않을 때 까지 순서대로 증가
		}
		
		
		//콘솔창에 9 부터 0까지 순서대로 출력되도록 for문을 구성해 보세요
		
		/*
		 * i라는 변수를 만들고 초기값 9 대입
		 * i가 0이상인 동안에 반복한다.
		 * i를 1씩 감소시키면서
		 * 
		 */
		for (int i=9; i>=0 ; i--) {
			System.out.println(i);
		}

	}

}
