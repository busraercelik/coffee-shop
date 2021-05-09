import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;
import concretes.NeroCustomerManager;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer("Büşra","Erçelik",1994,"56458999442");
        customerManager.save(customer);
    }
}
