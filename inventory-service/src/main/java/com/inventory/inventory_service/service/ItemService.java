package com.inventory.inventory_service.service;

import java.util.List;

import com.inventory.inventory_service.model.Item;
import com.inventory.inventory_service.repository.ItemRepository;

public class ItemService {
    private final ItemRepository repository = new ItemRepository();

    public List<Item> getAllItems() {
        return repository.getAllItems();
    }

    public Item getItemById(int id) {
        return repository.getItemById(id);
    }

    public void addItem(Item item) {
        repository.addItem(item);
    }

    public void updateItem(Item item) {
        repository.updateItem(item);
    }

    public void deleteItem(int id) {
        repository.deleteItem(id);
    }
}
