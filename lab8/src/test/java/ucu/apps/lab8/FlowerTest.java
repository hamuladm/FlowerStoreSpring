package ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.apps.lab8.flowers.flower.Flower;
import ucu.apps.lab8.flowers.flower.FlowerColor;
import ucu.apps.lab8.flowers.flower.FlowerPack;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flowerPack = new FlowerPack(flower);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("red", flower.getColor());
    }

    @Test
    public void testFlowerPack() {
        int quant = 30;
        Assertions.assertEquals(1, flowerPack.getQuantity());
        flowerPack.setQuantity(quant);
        double res = quant * flower.getPrice();
        Assertions.assertEquals(res, flowerPack.getPrice());
    }
}
