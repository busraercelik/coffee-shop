package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            throw new Exception(customer.getFirstName() + " "
            		+ customer.getLastName() 
            		+ " is not a valid person!");
        }
    }

}
