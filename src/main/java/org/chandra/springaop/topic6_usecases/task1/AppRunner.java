package org.chandra.springaop.topic6_usecases.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private ProductService productService;
    @Override
    public void run(String... args) throws Exception {
        productService.addProduct("P101", "Laptop");
        productService.updateProduct("P101");
        productService.deleteProduct("P101");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
