package com.dio.cartshopping.controller;

import com.dio.carrinhocompras.model.Carrinho;
import com.dio.carrinhocompras.model.Item;
import com.dio.carrinhocompras.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    private CartRepository cartRepository;

    @Autowired
    public CartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @PostMapping("/{id}")
    public Cart create(@PathVariable Integer id, @RequestBody Item item){
        Optional<Cart> cartSave = cartRepository.findById(id);
        Cart cart;
        if(cartSalvo.equals(Optional.empty())){
            cart = new Cart(id);
        }else {
            cart = cartSave.get();
        }
        cart.getItems().add(item);

        return cartRepository.save(cart);
    }

    @GetMapping
    public Iterable<Cart> findAll(){
        return cartoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        cartRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Cart> findById(@PathVariable Integer id){
        return cartRepository.findById(id);
    }

}
