package Concretes;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerManeger;
import Entities.Customer;


public class StarbucksCustomerManager extends CustomerManeger {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
     if (customerCheckService.checkIfRealPerson(customer)){
         super.save(customer);
     }else {
         System.out.println("geçersiz müşteri");
     }
    }


}
