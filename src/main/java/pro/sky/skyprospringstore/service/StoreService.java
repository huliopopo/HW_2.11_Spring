package pro.sky.skyprospringstore.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringstore.components.Basket;
import pro.sky.skyprospringstore.components.ItemStore;
import pro.sky.skyprospringstore.item.Item;

import java.util.List;


@Service
public class StoreService {
    private final Basket basket;
    private final ItemStore itemStore;

    public StoreService(Basket basket, ItemStore itemStore) {
        this.basket = basket;
        this.itemStore = itemStore;
    }


    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(id -> itemStore.getItemFromItemStore(id))
                        .toList()
        );
    }

    public List<Item> get() {
        return basket.get();
    }


}

