package com.bookstore.inventory_service.controller;

import com.bookstore.inventory_service.entity.Inventory;
import com.bookstore.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping("/{bookId}")
    public Optional<Inventory> getInventoryByBookId(@PathVariable Long bookId) {
        return inventoryService.findByBookId(bookId);
    }
}
