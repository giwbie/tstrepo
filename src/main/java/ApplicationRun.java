import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class ApplicationRun {

	public static void main(String[] args) {
		System.out.println("Start out application");
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
