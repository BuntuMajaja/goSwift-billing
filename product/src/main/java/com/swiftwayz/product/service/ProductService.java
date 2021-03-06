package com.swiftwayz.product.service;

import com.swiftwayz.domain.vehicle.Product;
import com.swiftwayz.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by sydney on 2017/04/09.
 */
@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> findByCode(String code) {
        return productRepository.findOneByCode(code);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }
}
