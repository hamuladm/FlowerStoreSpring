package ucu.apps.lab8.flowers.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private DeliveryStrategy delivery;
    private PaymentStrategy payment;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void setPaymentStrategy(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(DeliveryStrategy delivery) {
        this.delivery = delivery;
    }

    public List<Object> processOrder() {
        return List.of(this.payment, this.delivery, this.items);
    }
}
