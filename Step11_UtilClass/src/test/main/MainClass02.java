package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		// 점수를 저장 할 수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums 에 담기

		// ArrayList 객체에 10,20,30 숫자 3개를 담아 보세요

		// ArrayList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 콘솔창에 출력해 보세요

		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(10);
		nums.add(20);
		nums.add(30);

		for (int i = 0; i < nums.size(); i++) {
			// i번째 item
			int tmp = nums.get(i);
			// 콜솔창에 출력
			System.out.println(nums);
		}
		// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		System.out.println("↓확정 for문을 이용하면↓");
		for (int tmp : nums) {
			System.out.println(nums);
		}

		
				
		
	}
}
