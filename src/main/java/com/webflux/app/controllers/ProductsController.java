package com.webflux.app.controllers;

import com.webflux.app.documents.ProductDocument;
import com.webflux.app.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.HashMap;

@RestController
    @RequestMapping(path = "/api/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping(path = {"", "/"}, produces = "application/json")
    public ResponseEntity<Object> testServerAvailability() {
        HashMap<String, Object> response = new HashMap<>();
        response.put("response", "Server Ok");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "/productList", produces = "application/json")
    public ResponseEntity<Object> productsList(){
        HashMap<String, Object> response = new HashMap<>();
        Flux<ProductDocument> responseService = productsService.getProductsList();
        responseService.subscribe(element -> System.out.println("responseService: " + element));
        response.put("response", responseService);
        System.out.println("response: " + response.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
