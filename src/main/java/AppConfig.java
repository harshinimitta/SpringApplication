import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vu.repository.CustomerRepository;
import com.vu.repository.HibernateCustomerRepositoryImpl;
import com.vu.service.CustomerService;
import com.vu.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.vu"})
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//constructor injection
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
		//setter injection
		CustomerServiceImpl service = new CustomerServiceImpl();
		// service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
