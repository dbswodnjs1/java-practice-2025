package test.main;

import test.mypack.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {

		// 1.MemberInfo 객체를 3개 생성해서 그 참조값을 m1,m2,m3 라는 변수에 각가 담아 보세요(3줄 코딩)
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();

		// 2. m1,m2,m3 에 들어 있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아보세요(9줄 코딩)

		m1.num = 1;
		m1.name = "아무개";
		m1.addr = "강원도";
		
		m2.num = 2;
		m2.name = "마동석";
		m2.addr = "마포구";
		
		m3.num = 3;
		m3.name = "홍길동";
		m3.addr = "강남구";
		
		
		
		// 3.각가의 객체가 가지고 있는 PrintData() 메소드를 호출해 보세요(3줄 코딩)
		
		m1.printData();
		m2.printData();
		m3.printData();
		

	}

}
