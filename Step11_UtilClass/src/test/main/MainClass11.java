package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		
		int i = 0;
		while(i<15) {
			System.out.println(i+"반복 합니다");
			i++;
		}
		System.out.println("--------");
		
		int j= 0;
		// 무한 루프는 실행하다가 Break문을 만나면 탈출할수 있다.
		while(true) {
			System.out.println(j+"반복합니다");
			j++;
			//반복은 탈출조건을 이용해서
			if(j ==15) {
				break; //반복문을 탈출한다
			}
		}
		
	}

}
