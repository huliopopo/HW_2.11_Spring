package pro.sky.skyprospringstore.components;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pro.sky.skyprospringstore.item.Item;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemStore {
    private final Map<Integer, Item> itemStoreMap = new HashMap<>();

    @PostConstruct
    public void init() {
        itemStoreMap.put(1, new Item(1, "videocard"));
        itemStoreMap.put(2, new Item(2, "mainboard"));
        itemStoreMap.put(3, new Item(3, "CPU"));
    }

    public Item getItemFromItemStore(Integer id) {
        return itemStoreMap.get(id);
    }



/*    private final Map<Integer, Item> itemsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        itemsMap.put(1, new Item(1, "videocard"));
        itemsMap.put(2, new Item(2, "mainboard"));
        itemsMap.put(3, new Item(3, "CPU"));
    }

    public Item get(int id) {
        return itemsMap.get(id);
    }*/


}
