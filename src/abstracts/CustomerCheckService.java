package abstracts;

import entities.Customer;

// hem starbucks hem de nero için kullanmak üzere
public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
