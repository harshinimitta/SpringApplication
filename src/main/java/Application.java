import com.vu.service.CustomerService;
import com.vu.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findall().get(0).getLastName());
	}

}
