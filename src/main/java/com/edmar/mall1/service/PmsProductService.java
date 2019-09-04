package com.edmar.mall1.service;

import com.edmar.mall1.mbg.model.PmsProduct;

import java.util.List;

public interface PmsProductService {
    List<PmsProduct> listAllProduct();
    List<PmsProduct> listProduct(int page,int size);
    PmsProduct getProduct(Long id);
    int createProduct(PmsProduct Product);
    int deleteProduct(Long id);
    int updateProduct(Long id, PmsProduct product);
}
