package com.edmar.mall1.service.Imp;


import com.edmar.mall1.mbg.mapper.PmsProductMapper;
import com.edmar.mall1.mbg.model.PmsProduct;
import com.edmar.mall1.mbg.model.PmsProductExample;
import com.edmar.mall1.service.PmsProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PmsProductServiceImpl implements PmsProductService {
    @Autowired
    PmsProductMapper productMapper;
    @Override
    public List<PmsProduct> listAllProduct() {
        return productMapper.selectByExample(new PmsProductExample());
    }

    @Override
    public List<PmsProduct> listProduct(int page, int size) {
        PageHelper.startPage(page,size);
        return productMapper.selectByExample(new PmsProductExample());
    }

    @Override
    public PmsProduct getProduct(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int createProduct(PmsProduct product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int deleteProduct(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateProduct(Long id, PmsProduct product) {
        product.setId(id);
        return productMapper.updateByPrimaryKeySelective(product);
    }
}
