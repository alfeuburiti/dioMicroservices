package com.dio.cartshopping.repository;

import com.dio.cartshopping.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
