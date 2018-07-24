package com.example.demo.controller;

import com.example.demo.Repository.ShopRepository;
import com.example.demo.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    ShopRepository shopRepository;

    @GetMapping("/all")
    public List<Shop> getAll(){
        return (List<Shop>) shopRepository.findAll();
    }
}
