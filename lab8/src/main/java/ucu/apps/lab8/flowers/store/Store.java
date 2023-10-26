package ucu.apps.lab8.flowers.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Store {
    private List<Item> items;

    public List<Item> search(FIlter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
