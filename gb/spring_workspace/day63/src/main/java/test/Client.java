package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		// BeanFactory bf = new BeanFactory();
		// Phone phone = (Phone)bf.getBean(args[0]);
		
		// GenericXmlApplicationContext : XML 파일로부터 정보를 읽어와 객체를 생성하고 초기화
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		Phone phone = (Phone)factory.getBean("apple"); // Look up
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.powerOff();

		phone = (Phone)factory.getBean("kiwi"); // Look up
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.powerOff();
		
		factory.close();
	}
}
