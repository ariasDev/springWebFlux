package com.webflux.app.services;

import com.webflux.app.documents.ProductDocument;
import reactor.core.publisher.Flux;

public interface ProductsService {

    public Flux<ProductDocument> getProductsList();

}
