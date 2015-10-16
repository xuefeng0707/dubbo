package dubbo.demo.service.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo_provider.xml");
		ctx.start();
		
		System.in.read();
	}
}
