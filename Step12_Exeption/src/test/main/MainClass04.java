
package test.main;
// run 버튼을 누르면 실행의 흐름(Thread) 가 main() 메소드에서 시작 되는데 이걸 main Thread 라고 도 한다.
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			/*
			 * Thread.sleep() 메소드 내부에서는 RuntimeExcrption 을 상속 받지 않은
			 * InterruptedException 이 발생 한다.RuntimeExcrption 을 상속 받지 않은
			 *예외는 예외 처리를 의무적으로 해야 한다. 
			 *처리 하는 방법
			 *Throw
			 *try-catch 로 묶어주기
			 */
			
			
			Thread.sleep(5000); //5초 기다림
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}

}
