package com.webflux.app;

import com.webflux.app.documents.ProductDocument;
import com.webflux.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------");
        Flux.just(new ProductDocument("p1", "teclado inhalambrico", 450.000, new Date()),
                new ProductDocument("p2", "mouse", 450.000, new Date()),
                new ProductDocument("p3", "pantalla", 450.000, new Date()),
                new ProductDocument("p4", "teclado 60%", 450.000, new Date())
        ).flatMap(element -> productRepository.save(element)).subscribe(element -> System.out.println("element: " +  element));
    }
}
