package concretes;

import abstracts.CustomerCheckService;
import entities.Customer;

//starbucks'a hiçbir şekilde bağlı olmadan sistem yapıyorum.
public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
