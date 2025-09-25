package com.upc.jparailway.service;

import com.upc.jparailway.model.Item;
import com.upc.jparailway.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> findAll() {
        return itemRepository.findAll();
    }
    public Item insert(Item item) {
        return itemRepository.save(item);
    }
}
