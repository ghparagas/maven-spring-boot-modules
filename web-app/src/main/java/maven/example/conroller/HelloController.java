package maven.example.conroller;

import maven.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {
        return new ShippingAddress();
    }

}
