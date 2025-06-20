package test.mypack;

public class PostDto {
	private int id;
	private String content;
	private String author;


	public PostDto() {
		
		

	}
	//생성자는 필요에 따라서 다른 모양으로 여러개 정의 할수도 있다.
	
	public PostDto(int id, String content, String author) {
		this.id = id;
		this.content = content;
		this.author = author;
		System.out.println(id);
		System.out.println(content);
		System.out.println(author);
		
	}
	
	
	
	
	// 필드에 저장된 회원의 번호를 리턴해주는 메소드
	public int getId() {
		// 필드에 저장된값 리턴하기
		return this.id;
	}

	// 필드에 저장된 회원의 이름
	public String getContent() {
		return this.content;
	}

	// 필들에 저장된 회원의 주
	public String getAuthor() {
		return this.author;
	}

	// 매개변수에 전달되는 회원의 번호를 필드에 저장하는 메소드
	public void setId(int id) { // 매게변수도 data type 을 선언해야 한다.
		// 매개변수(지역변수) num에 담긴 값을 필드 num에 대입하기
		this.id = id;

	}

	// 매개변수에 전달되는 회원의 이름을 필드에 저장하는 메소드를 만들어 보세요.
	public void setContent(String content) {
		this.content = content;

	}

	// 매개변수에 전달되는 회원의 주소를 필드에 저장하는 메소드를 만들어 보세요.
	public void setAuthor(String author) {
		this.author = author;

	}

}
