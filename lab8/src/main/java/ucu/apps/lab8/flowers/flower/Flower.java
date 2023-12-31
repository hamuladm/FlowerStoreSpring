package ucu.apps.lab8.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Flower {
    @Id
    private Long id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.id = flower.id;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
