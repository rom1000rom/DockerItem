package com.rom1000rom.service;


import com.rom1000rom.entity.Item;
import com.rom1000rom.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    @PostConstruct
    public void init() {
        itemRepository.save(new Item(1, "Hello"));
        itemRepository.save(new Item(2, "Java"));
        itemRepository.save(new Item(3, "Meet"));
        itemRepository.save(new Item(4, "Up!!!"));
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}