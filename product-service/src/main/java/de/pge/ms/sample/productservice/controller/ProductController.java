package de.pge.ms.sample.productservice.controller;

import de.pge.ms.sample.productservice.model.Product;
import de.pge.ms.sample.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(OK)
    public List<Product> findAll() {
       return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
