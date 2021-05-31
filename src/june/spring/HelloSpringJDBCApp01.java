package june.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import june.spring.service.SungJukService;

public class HelloSpringJDBCApp01 {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("springjdbc01.xml");
		
		SungJukService sjsrv = 
				(SungJukService) ctx.getBean("sjsrv");
		// 성적 데이터 생성후 디비에 저장
		sjsrv.newSungJuk();
		
	}

}
