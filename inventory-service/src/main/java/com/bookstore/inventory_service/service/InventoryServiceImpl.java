package com.bookstore.inventory_service.service.impl;

import com.bookstore.inventory_service.entity.Inventory;
import com.bookstore.inventory_service.repository.InventoryRepository;
import com.bookstore.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Optional<Inventory> findByBookId(Long bookId) {
        return inventoryRepository.findByBookId(bookId);
    }

    @Override
    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}
