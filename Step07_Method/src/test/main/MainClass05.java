package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해 보세요.
		// 실행했을 때 Exception 이 발생하지 않아야 한다.
		
	
		Messenger mes = new Messenger();
		
		Post p1 = new Post(2, "제목2", "작성자2");
		mes.sendPost(p1);
		
		mes.sendPost(new Post(1, "제목1", "작성자1"));

	}

		
}
