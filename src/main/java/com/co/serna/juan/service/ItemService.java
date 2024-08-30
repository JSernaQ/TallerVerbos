package com.co.serna.juan.service;

import com.co.serna.juan.model.GroceryItem;
import com.co.serna.juan.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public String getAll() {
        List<GroceryItem> items = itemRepository.findAll();
        return "---ITEMS EXISTENTES---\n" + items.toString();
    }


    public String insert(GroceryItem groceryItem) {
        try {
            itemRepository.save(groceryItem);
            return "---ITEM INSERTADO---\n" + groceryItem.toString();
        } catch (Exception e) {
            return "---ERROR AL INSERTAR ITEM---\n" + e.getMessage();
        }
    }


    public String update(GroceryItem groceryItem) {
        Optional<GroceryItem> existingItem = itemRepository.findById(groceryItem.getId());
        if (existingItem.isPresent()) {
            itemRepository.save(groceryItem);
            return "---ITEM ACTUALIZADO---\n" + groceryItem.toString();
        }
        return "---ITEM NO ENCONTRADO---";
    }

    public String delete(String id) {
        Optional<GroceryItem> existingItem = itemRepository.findById(id);
        if (existingItem.isPresent()) {
            itemRepository.deleteById(id);
            return "---ITEM ELIMINADO---";
        }
        return "---ITEM NO ENCONTRADO---";
    }

    public String updateData(String id, GroceryItem groceryItem) {
        Optional<GroceryItem> existingItem = itemRepository.findById(id);
        if (existingItem.isPresent()) {
            GroceryItem item = existingItem.get();
            if (groceryItem.getName() != null) {
                item.setName(groceryItem.getName());
            }
            if (groceryItem.getCategory() != null) {
                item.setCategory(groceryItem.getCategory());
            }
            itemRepository.save(item);
            return "---ITEM ACTUALIZADO---\n" + item.toString();
        }
        return "---ITEM NO ENCONTRADO---";
    }
}
