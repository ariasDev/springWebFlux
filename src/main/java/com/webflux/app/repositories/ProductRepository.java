package com.webflux.app.repositories;

import com.webflux.app.documents.ProductDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<ProductDocument, String> {
}
