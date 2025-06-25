package test.mypac;

/*
 * 클래스안에 1.필드 2.메소드 3.생성자 4.클래스 
 */
public class Zoo {
	// 내부 클래스(Inner Class)
	public class Monkey {
		public void say() {
			System.out.println("안녕! 나는 원숭이야~");
		}
	}

	// 내부 클래스(Inner Class)
	public class Tiger {
		public void roar() {
			System.out.println("어흥~~");
		}
	}

	// 메소드 (호출되면 Monkey 객체를 생성해서 리턴해 주는 메소드)
	public Monkey getMonkey() {
		return new Monkey();
	}

	// 메소드 (호출되면 Tiger 객체를 생성해서 리턴해 주는 메소드)
	public Tiger getTiger() {
		return new Tiger();
	}
}
