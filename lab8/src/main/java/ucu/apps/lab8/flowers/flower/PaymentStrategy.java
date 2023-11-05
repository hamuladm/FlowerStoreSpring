package ucu.apps.lab8.flowers.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentStrategy implements Payment {

    @Override
    @GetMapping("/creditcard")
    public String creditCard(String info) {
        return info;
    }

    @Override
    @GetMapping("/paypal")
    public String PayPal(String email) {
        return email;
    }
}
