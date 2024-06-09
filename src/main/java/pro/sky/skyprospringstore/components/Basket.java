package pro.sky.skyprospringstore.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprospringstore.item.Item;

import java.util.*;

@Component
@SessionScope
public class Basket {
    public final List<Item> items = new ArrayList<>();

    public void add(List<Item> items) {
        this.items.addAll(items);

    }

    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }


}
