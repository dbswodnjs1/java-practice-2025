package test.main;

import test.mypack.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//객체 생성에서 default 생성자에 실행의 흐름이 들어오는지 확인 하기
		new MemberDto();
		
		MemberDto dto = new MemberDto();
		
		MemberDto dto2=new MemberDto(1, "ddd", "ccc");
		
		MemberDto dto3= new MemberDto();
		dto3.setNum(2);
		dto3.setName("ddd");
		dto3.setAddr("vvv");
	}

}
