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
    public String getCustomerId(@RequestParam int customerId){
        customerService.getCustomerById(customerId );
        return "Customer Id: " + customerId;
    }

}
