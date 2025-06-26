package test.main;

import test.mypac.Warmer;

public class MainClass06 {
	public static void main(String[] args) {

		Warmer w1 = new Warmer() {
			@Override
			public void warm(String target) {
				System.out.println(target + "을(를) 따뜻하게 해요");

			}
		};
		useWarmer(w1);

		Warmer w2 = (String target) -> {
			System.out.println(target + "을(를) 뜨겁게 해요");
		};
		useWarmer(w2);

		//매게변수의 type 생략 가능
		Warmer w3 = (t) -> {
			System.out.println(t + "을(를) 흔들어요");
		};
		useWarmer(w3);
	}

	public static void useWarmer(Warmer w) {
		w.warm("손");
	}
}
