package com.how2java.dao.impl;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * @author DayoWong on 2018/8/26
 */
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {
    @Override
    public List list() {
        return  find("from Product");
    }

    @Override
    public void add(Product p) {
        save(p);
    }
}
