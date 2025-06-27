package test.main;

import test.box.AppleBox;
import test.fruit.Apple;

public class MainClass01 {
	public static void main(String[] args) {
		// Apple 객체를 생성해서 AppleBox 객체의 담아 보세요.
		
		Apple a = new Apple();
		AppleBox ab = new AppleBox();
		
		ab.pack(a);
		
	}
	

}
