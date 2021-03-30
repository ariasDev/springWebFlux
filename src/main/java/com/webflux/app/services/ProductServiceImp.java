package com.webflux.app.services;

import com.webflux.app.documents.ProductDocument;
import com.webflux.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductServiceImp implements ProductsService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Flux<ProductDocument> getProductsList() {
        Flux<ProductDocument> response = productRepository.findAll();
        System.out.println("---------------------------------------------------");
        response.subscribe(element -> System.out.println("elemet: " + element));
        return response;
    }
}
