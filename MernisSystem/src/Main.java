
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();

		customer.setId(1);
		customer.setNatioanlityId("******");
		customer.setFirstName("Ýrem");
		customer.setLastName("Altýnöz");
		customer.setDateOfBirth( LocalDate.of(2001,01,19));
		
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer);
	}

}
