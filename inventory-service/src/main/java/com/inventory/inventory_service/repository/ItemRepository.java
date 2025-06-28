package com.inventory.inventory_service.repository;

import java.util.ArrayList;
import java.util.List;

import com.inventory.inventory_service.model.Item;

public class ItemRepository {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(int id) {
        return items.stream()
            .filter(item -> item.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(Item updatedItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == updatedItem.getId()) {
                items.set(i, updatedItem);
                return;
            }
        }
    }

    public void deleteItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }
}
