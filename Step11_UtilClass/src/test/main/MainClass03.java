package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();

		// 위에서 생성한 Scanner 객체로 반복문 돌면서 문자열을 5번 입력받아서
		for (int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			String line = scan.nextLine();

			a.add(line);
		}
		// 입력 받을 때 마다 ArrayList<String> 객체에 add()하고

		// 다 입력 받으면 다시 한번 반복문 돌면서 ArrayList<Srting> 객체에 저장된 문자열 5개를
		// 순서대로 콘솔창에 출력하는 프로그래밍을 해보세요.

		for (int i = 0; i < a.size(); i++) {
			String tmp1 = a.get(i);
			System.out.println("입력: ");

		}
		for(String tmp2:a) {
			System.out.println(tmp2);
		}
	}

}
