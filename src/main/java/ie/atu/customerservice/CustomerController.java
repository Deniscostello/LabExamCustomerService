package ie.atu.customerservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    Customer customer;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }


    @PostMapping("/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public String createCustomer(@RequestBody Customer customer){
        return  customerService.createCustomer(customer);
    }

    @GetMapping("/getCustomer")
    public Customer getCustomerId(@RequestParam int customerId){
        return customerService.getCustomerById(customerId );
    }

    @PostMapping("/createOrder")
    public String orderDetails(Customer customer){
        if(customer.getAge()>18){
            return "Order add";
        }else {
           return  "You are too young to place an order";
        }
    }

}
