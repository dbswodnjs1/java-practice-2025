package test.mypac;

//함수 형태로 쓰기위한 이노테이션 (메소드 1개가 강제 된다.)
@FunctionalInterface
public interface Warmer {
	public void warm(String target);//무언가를 멥히는 가상의 메소드

}
