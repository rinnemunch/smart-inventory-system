package com.inventory.inventory_service.controller;

import com.inventory.inventory_service.model.Item;
import com.inventory.inventory_service.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service = new ItemService();

    @GetMapping
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        return service.getItemById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        service.addItem(item);
    }

    @PutMapping("/{id}")
    public void updateItem(@PathVariable int id, @RequestBody Item item) {
        item.setId(id);
        service.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        service.deleteItem(id);
    }
}
