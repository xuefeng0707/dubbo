package dubbo.demo.service.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubbo.demo.service.DemoService;

public class DemoConsumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "demo_consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法

		System.out.println(hello); // 显示调用结果
	}
}
