package pro.sky.skyprospringstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringstore.item.Item;
import pro.sky.skyprospringstore.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")

public class StoreController {
    private final StoreService storeService;


    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> ids) {
        storeService.add(ids);
    }


    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }
}
