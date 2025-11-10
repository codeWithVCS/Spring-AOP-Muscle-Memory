package org.chandra.springaop.topic6_usecases.task1;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void addProduct(String productId,String name){
        System.out.println("Product added: " + productId + ", " + name);
    }
    public void updateProduct(String productId){
        System.out.println("Product updated: " + productId);
    }
    public void deleteProduct(String productId){
        System.out.println("Product deleted: " + productId);
    }
}
