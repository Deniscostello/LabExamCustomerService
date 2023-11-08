package ie.atu.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="order-service", url="http://localhost:8080")
public interface NewOrderClient {
    @PostMapping("/create")
    Object customerDetails(@RequestBody Customer customer);

}
