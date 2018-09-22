package com.how2java.service.impl;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

import java.util.List;

/**
 * @author DayoWong on 2018/8/26
 */
public class ProductServiceImpl implements ProductService {
    private ProductDAO productDAO;
    @Override
    public List<Product> list() {
        return productDAO.list();
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
}
