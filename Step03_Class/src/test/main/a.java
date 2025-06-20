package test.main;

import test.mypack.PostDto;

public class a {
	public static void main(String[] args) {
		//객체 생성에서 default 생성자에 실행의 흐름이 들어오는지 확인 하기
				
				
				PostDto dto = new PostDto();
				
				PostDto dto2=new PostDto(3, "ddd", "ccc");
				
				PostDto dto3= new PostDto();
				dto3.setId(4);
				dto3.setContent("vdd");
				dto3.setAuthor("dvv");
				
				System.out.println(dto3.getId());
				System.out.println(dto3.getContent());
				System.out.println(dto3.getAuthor());
				
				
				
			}
	}

