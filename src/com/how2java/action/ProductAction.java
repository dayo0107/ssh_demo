package com.how2java.action;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.apache.struts2.ServletActionContext;


import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @author DayoWong on 2018/8/26
 */
public class ProductAction {

    private ProductService productService;
    private List<Product> products;

    public String list() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String msg = "message";
        request.setAttribute("msg",msg);
        products = productService.list();
        return "listJsp";
    }


    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
