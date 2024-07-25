package com.lailack.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.lailack.blog 패키지 이하를 스캔하여 모든 파일을 메모리에 new 하지 않음
// 특정 어노테이션이 붙어 있는 클래스 파일들을 new 해서 IoC() 스프링 컨테이너에 관리함
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1> Hello spring Boot </h1?>";
				
	}

}
