package com.pgleon.xmall.service;

import com.pgleon.xmall.pojo.Category;
import com.pgleon.xmall.pojo.Product;

import java.util.List;

public interface ProductService {

    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    void fill(List<Category> categorys);
    void fill(Category category);
    void fillByRow(List<Category> categorys);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
