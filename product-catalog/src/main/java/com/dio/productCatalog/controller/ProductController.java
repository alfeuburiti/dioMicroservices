package com.dio.productCatalog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(Product productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        productRepository.deleteById(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }

    @GetMapping("/nome/{nome}")
    public Iterable<Product> findByName(@PathVariable String nome) {
        return productRepository.findByNome(nome);
    }
}