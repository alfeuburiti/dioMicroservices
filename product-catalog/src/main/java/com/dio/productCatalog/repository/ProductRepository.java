package com.dio.productCatalog.repository;

import com.dio.catalogoproduto.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
    List<Produto> findByNome(String name);
}
