package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class Mainclass01 {
	public static void main(String[] args) {
		//추상 클래스 data type 의 역할을 할 수가 있다.
		Weapon w1 = null;
		
		//그렇다면 Weapon type 의 참조값은 어떻게 얻어갈까? 
		// Weapon w1 = new Weapon();추상클래스는 단독객체 생성은 불가
		
		//Weapon 추상클래스를 상속받은 MyWeapon대체해서 생성
		Weapon w2= new MyWeapon();
		w2.attack();
		w2.prepare();
		
		
		
	}
}
