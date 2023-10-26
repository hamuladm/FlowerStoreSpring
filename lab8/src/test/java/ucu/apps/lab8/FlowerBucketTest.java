package ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ucu.apps.lab8.flowers.flower.Flower;
import ucu.apps.lab8.flowers.flower.FlowerBucket;
import ucu.apps.lab8.flowers.flower.FlowerPack;
import ucu.apps.lab8.flowers.flower.FlowerType;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        Assertions.assertEquals(FlowerType.ROSE, flower.getFlowerType());
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
