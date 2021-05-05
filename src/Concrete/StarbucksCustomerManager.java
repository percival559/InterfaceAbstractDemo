package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ValidationService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    
	ValidationService validationService;
	
	public StarbucksCustomerManager(ValidationService _validationService) {
		validationService = _validationService;
	}
	
	@Override
	public void save(Customer customer) {
		if(validationService.Validate(customer)) {
			System.out.println("Saved to db: "+customer.firstName);
		}else {
			System.out.println("Geçersiz Kiþi. ");
		}
    
	}
}