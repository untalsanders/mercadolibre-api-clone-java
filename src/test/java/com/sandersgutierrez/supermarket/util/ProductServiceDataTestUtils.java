package com.sandersgutierrez.supermarket.util;

import com.sandersgutierrez.supermarket.domain.Category;
import com.sandersgutierrez.supermarket.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductServiceDataTestUtils {
    public static List<Product> getMockProductList() {
        List<Product> productList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            List<Category> categoryList = getMockCategoryList();
            Category category = categoryList.get(new Random().nextInt(1, categoryList.size()));

            Product product = new Product();

            product.setProductId(i);
            product.setCategoryId(category.getCategoryId());
            product.setName("Product #" + i);
            product.setPrice(new Random().nextInt(10, 100_000));
            product.setStock(new Random().nextInt(0, 1_000_000));
            product.setActive(true);
            product.setCategory(category);

            productList.add(product);
        }

        return productList;
    }

    public static List<Category> getMockCategoryList() {
        List<Category> categoryList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Category category = new Category();
            category.setCategoryId(i);
            category.setName("Category #" + i);
            category.setDescription("Description to Category #" + i);
            category.setActive(true);
            categoryList.add(category);
        }

        return categoryList;
    }
}
