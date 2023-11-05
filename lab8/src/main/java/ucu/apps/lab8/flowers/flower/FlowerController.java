package ucu.apps.lab8.flowers.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlowerController {
    @GetMapping("/list")
	public FlowerBucket init() {
		Flower flower1 = new Flower(1.5, FlowerColor.RED, 20, FlowerType.ROSE);
        Flower flower2 = new Flower(2.5, FlowerColor.BLUE, 30, FlowerType.CHAMOMILE);
        FlowerPack flowerpack1 = new FlowerPack(flower1, 10);
        FlowerPack flowerpack2 = new FlowerPack(flower2, 10);
        FlowerBucket flowerbucket = new FlowerBucket();
        flowerbucket.addFlowerPack(flowerpack1);
        flowerbucket.addFlowerPack(flowerpack2);
		return flowerbucket;
	}

    @PostMapping("/add")
    public void addFlower(Flower flower) {

    }
}
