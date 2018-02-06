import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vu.repository.CustomerRepository;
import com.vu.repository.HibernateCustomerRepositoryImpl;
import com.vu.service.CustomerService;
import com.vu.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
