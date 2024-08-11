package com.javatalent.productservice.service;

import com.javatalent.productservice.payload.ProductRequest;
import com.javatalent.productservice.payload.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    public void deleteProductById(long productId);
}