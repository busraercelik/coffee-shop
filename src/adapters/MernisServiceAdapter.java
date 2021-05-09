package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;
import java.util.Date;

public class MernisServiceAdapter implements CustomerCheckService {
	
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoap client = new KPSPublicSoapProxy();
     
        try {
             client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId())
                    ,customer.getFirstName().toUpperCase()
                    ,customer.getLastName().toUpperCase()
                    ,customer.getDateOfBirth());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
