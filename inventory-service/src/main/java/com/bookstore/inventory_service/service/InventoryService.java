package com.bookstore.inventory_service.service;

import com.bookstore.inventory_service.entity.Inventory;

import java.util.Optional;

public interface InventoryService {
    Optional<Inventory> findByBookId(Long bookId);
    Inventory saveInventory(Inventory inventory);
}
