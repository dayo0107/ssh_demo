package com.how2java.dao;

import com.how2java.pojo.Product;

import java.util.List;

/**
 * @author DayoWong on 2018/8/26
 */
public interface ProductDAO {
     List list();
     void add(Product p);
}
