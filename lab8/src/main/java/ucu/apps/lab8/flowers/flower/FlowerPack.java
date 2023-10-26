package ucu.apps.lab8.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public void setQuantity(int quantityQ) {
        if (quantityQ < 1) {
            this.quantity = 1;
        }
        else {
            this.quantity = quantityQ;
        }
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
