import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vu.service.CustomerService;
import com.vu.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findall().get(0).getLastName());
	}

}
