package ie.atu.customerservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    ArrayList<Customer> customers = new ArrayList<>();

    public String createCustomer(Customer customer){
        customers.add(customer);
        return "Customer " + customer.getName() + " created";
    }

    public String getCustomerById(){
        return null;
    }
}
