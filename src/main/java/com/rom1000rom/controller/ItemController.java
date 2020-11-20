package com.rom1000rom.controller;


import com.rom1000rom.entity.Item;
import com.rom1000rom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/")
    public List<Item> items() {
        return itemService.findAll();
    }

}