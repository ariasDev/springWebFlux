package com.webflux.app.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductsDocument {

    @Id
    private string id;

    private string name;
    private Double price;
    private Date createAt;

    public ProductsDocument(string id, string name, Double price, Date createAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createAt = createAt;
    }

    public ProductsDocument() {
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
