package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import mernisReference.HIKKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        HIKKPSPublicSoap client = new HIKKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),Integer.valueOf(customer.getDateOfBirth().getYear()));
    }
}
