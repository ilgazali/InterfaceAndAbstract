package Abstracts;

import Entities.Customer;

public abstract class CustomerManeger implements CustomerService {

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to database : "+ customer.getFirstName());
    }
}
