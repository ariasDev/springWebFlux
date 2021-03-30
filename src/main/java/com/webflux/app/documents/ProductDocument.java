package com.webflux.app.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "products")
public class ProductDocument {

    @Id
    private String id;

    private String name;
    private Double price;
    private Date createAt;

    public ProductDocument(String id, String name, Double price, Date createAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createAt = createAt;
    }

    public ProductDocument() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDocument{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createAt=" + createAt +
                '}';
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
