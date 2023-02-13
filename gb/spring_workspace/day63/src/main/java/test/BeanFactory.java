package test;

public class BeanFactory {
	public Object getBean(String beanName) {
		if (beanName.equals("apple")) {
			return new ApplePhone();
		} else if (beanName.equals("kiwi")) {
			return new KiwiPhone();
		}
		return null;
	}
}
