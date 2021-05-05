package Concrete;

import Abstract.ValidationService;
import Entities.Customer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean Validate(Customer customer) {
		System.out.println("Validatioon process works");
		return true;
	}

}
