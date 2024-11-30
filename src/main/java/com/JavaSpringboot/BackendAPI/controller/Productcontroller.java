package com.JavaSpringboot.BackendAPI.controller;



import com.JavaSpringboot.BackendAPI.Product;
import com.JavaSpringboot.BackendAPI.dto.ProductDTO;
import com.JavaSpringboot.BackendAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class Productcontroller {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<Page<Product>> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "10") int size) {
        Page<Product> products = productService.getAllProducts(PageRequest.of(Math.max(page, 0), Math.max(size, 1)));
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{di}")
    public ProductDTO getProductById(@PathVariable("di") Long id) {
        Product product = productService.getProductById(id);
        return productService.getProductDTO(product);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{di}")
    public ResponseEntity<Product> updateProduct(@PathVariable("di") Long id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        if (updatedProduct != null) {
            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{di}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("di") Long id) {
        boolean isDeleted = productService.deleteProduct(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

