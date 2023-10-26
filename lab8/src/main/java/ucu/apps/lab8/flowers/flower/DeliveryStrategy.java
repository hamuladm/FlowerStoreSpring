package ucu.apps.lab8.flowers.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryStrategy implements Delivery {
    @Override
    @GetMapping("/dhl")
    public String DHLDelivery(FlowerBucket flowers){
        return "DHL";
    }

    @Override
    @GetMapping("/post")
    public String PostDelivery(FlowerBucket flowers) {
        return "Post";
    }
} 