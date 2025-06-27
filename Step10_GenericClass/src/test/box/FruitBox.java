package test.box;

//Generic 클래스 T 를 전달 받을 수 있는 클래스설계하기
public class FruitBox<T> {
	//T 를 필드의 type 으로 활용
	private T item;
	
	//T 를 매게변수의 type 으로 활용
	public void pack(T item) {
		this. item = item;
	}
	
	// T를 메소드의 리턴 type 활용
	public T unpack() {
		return item;
	}

}
