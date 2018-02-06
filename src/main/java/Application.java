import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vu.service.CustomerService;
import com.vu.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);
		System.out.println(customerService.findall().get(0).getFirstName());
	}

}
