package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// java 에서 배열은 용도가 한정 되어 있다. item 을 담을수 있는 공간을 늘이거나 줄일수 있다.

		// 문자열(String) type 을 담을 수 있는 방 5개 자리 객체 생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";

		// 아이템을 개수 상관없이 필요에 따라 마음대로 추가하거나 제거 할 수 있는 배열목록(ArrayList) 객체 생성하기
		ArrayList<String> friends = new ArrayList<>();
		

		// 김구라, 해골 ,원숭이 를 순서대로 담아 보세요(3줄 코딩)
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		
		//2번방의 item 을 "신현호" 로 수정
		friends.set(2, "신현호");

		// 0 번방의 아이템을 불러와서 item 이라는 변수에 담기
		String item = friends.get(0);

		// 1 번방의 아이템 삭제
		friends.remove(1);

		// 저장된 아이템의 개수(size) 를 size 라는 지역 변수에 담기
		int size=friends.size();
		
		// 0 번방의 "에이콘" 을 끼워 넣기
		friends.add(0, "에이콘");

		// 저장된 모든 아이템 전체 삭제
		friends.clear();
		
		
		
	}

}
