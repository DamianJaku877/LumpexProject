package com.example.demo.controller;

import com.example.demo.model.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<Shop,Long> {

}
