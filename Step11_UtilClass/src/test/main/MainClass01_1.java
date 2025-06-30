package test.main;

import java.util.ArrayList;

public class MainClass01_1 {
	public static void main(String[] args) {
		// java 에서 배열은 용도가 한정 되어 있다. item 을 담을수 있는 공간을 늘이거나 줄일수 있다.

		// 문자열(String) type 을 담을 수 있는 방 5개 자리 객체 생성
		String[] fruits = new String[5];
		fruits[0] = "Apple";
		fruits[1] = "Bnana";
		fruits[2] = "Melon";

		// 아이템을 개수 상관없이 필요에 따라 마음대로 추가하거나 제거 할 수 있는 배열목록(ArrayList) 객체 생성하기
		ArrayList<String> fruit = new ArrayList<>();
		

		// "Apple", "Banana", "Melon"을 리스트에 순서대로 추가하세요.(3줄 코딩)
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Melon");
		
		
		// 2번방에 저장된 값을 "Watermelon"으로 수정하세요.
		
		fruit.set(2, "Watermelon");
		
		// 0번방의 과일 이름을 꺼내어 String f 이라는 변수에 저장하세요.
		String f = fruit.get(0);
		

		// 1번방의 과일을 삭제하세요.
		fruit.remove(1);
		

		// 현재 저장된 과일의 개수를 int size라는 변수에 저장하세요.
		int size = fruit.size();
		
		// 0번 인덱스에 "Grape"를 끼워 넣으세요.
		fruit.add(0, "grape");

		// 저장된 모든 과일을 리스트에서 삭제하세요.
		fruit.clear();
		
		
		
		
	}

}
