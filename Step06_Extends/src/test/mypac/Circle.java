package test.mypac;

//error, 문법이 성링 안됨
//문법이 맞다고 가정하면 new Circle() 이 가능하다는 것 상속 관계 때문에 new Shape()도 호출된다.
//Shape 클래스는 디폴트 생성자가 없어서 생성 불가
//Shape 클래스는 생성자의 매개변수 x,y 좌표를 전달 해야 한다
/*
 * public class Circle extends Shape{  }  
 * 
 */

//Shape(도형) 클래스를 상속 받아서 Circle 클래스 정의하기
public class Circle extends Shape {
	// 원의 반지름 저장 할 필드
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y); // super( )는 부모 클래스의 생서자를 의미한다.
		this.radius = radius;

	}

	public void printArea() {
		// 원의 넓이
		double area = Math.PI * radius * radius;
		System.out.println("원의 넓이는:" + area);
	}

	@Override
	public void printInfo() {

		super.printInfo();
		System.out.println("반지름 :" + radius);
	}

}
