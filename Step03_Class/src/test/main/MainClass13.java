package test.main;

import test.mypack.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setNum(1);
		dto.setName("nnn");
		dto.setAddr("aaa");

		// dto 객체에 보관된 num, name, addr 를 참조하고 싶다면?
		// 회원의 번호 콘솔창에 출력하고 싶다면??
		System.out.println(dto.getNum());
		// 회원의 이름을 콘솔창에 출력하고 싶다면??
		System.out.println(dto.getName());
		// 회원의 주소을 콘솔창에 출력하고 싶다면??
		System.out.println(dto.getAddr());
		
		//dto의 getter 메소드를 호출해서 리턴되는 값을 변수에 연습삼아 담아보
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
				

	}

}
