package test.main;

import test.mypac.Weapon;

public class Mainclass06 {
	public static void main(String[] args) {
		/*
		 * Cyber 공간을 공격하고 싶다 클래스 파일을 따로 만들기 싫다 =>Local Inner Class 로 마들면 된다. 근데 생각해보면
		 * MyWeapon, SkyWeapon, SpaceWeapon 등의 type 은 필요없. 따라서, 클래스의 이름을 짓기도 귀찮음=> 익명의
		 * Local Inner Class 을 활용
		 * 
		 */
		Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				prepare();
				System.out.println("Cyber 공격을 해요");
			}

		};
		w1.attack();
		
		/*
		 * 가상(Virtual) 공간을 공격해야 한다
		 * 익명의 Local Inner Class 를 이용해서 Weapon type 객체를 생성해서 공격할 예정인데
		 * 1번만 공격 => 위에처럼 w1 이라는 변수를 만들지 않고 1회용으로 객체를 만들어서 사용할 예정
		 * 
		 */
		
		new Weapon() {//익명 클래스로 생성한 Weapon타입의 참조값
			
			@Override
			public void attack() {
				prepare();
				System.out.println("Virtual 공간을 공격해요!");
				
			}
			
		}.attack(); //참조값을 변수에 담지 않고 바로 사용 할수도 있다
		

	}

}
