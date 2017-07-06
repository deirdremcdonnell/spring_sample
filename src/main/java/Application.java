import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Application
 */
public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl(); // hardcoded ref
		final List<Customer> customers = service.findAll();
		for (Customer customer : customers) {
			System.out.println("Name : " + customer.getFirstName());
		}
	}

}
// Config code can make testing hard.
// App -> instance of CusObj -> Repos
