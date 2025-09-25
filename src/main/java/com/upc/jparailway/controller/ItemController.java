package com.upc.jparailway.controller;

import com.upc.jparailway.model.Item;
import com.upc.jparailway.repository.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {
    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @GetMapping
    public ResponseEntity<List<Item>> findAll() {
        return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Item> insert(@RequestBody Item item) {
        return new ResponseEntity<>(itemRepository.save(item), HttpStatus.CREATED);
    }
}
