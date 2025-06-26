package test.mypac;

public class MyRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("불륨을 올려요~");
		
	}

	@Override
	public void down() {
		System.out.println("불륨을 내려요~");
		
	}

}
