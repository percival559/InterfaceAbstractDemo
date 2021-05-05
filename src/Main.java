
import Abstract.ValidationService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Concrete.ValidationManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        customer.Id=1;
        customer.firstName="Harungilebis";
        customer.lastName="asdas";
        
        ValidationService validationService=new ValidationManager();
        		
        NeroCustomerManager neroManager=new NeroCustomerManager();
        StarbucksCustomerManager starManager=new StarbucksCustomerManager(validationService);
        starManager.save(customer);

	}

}
