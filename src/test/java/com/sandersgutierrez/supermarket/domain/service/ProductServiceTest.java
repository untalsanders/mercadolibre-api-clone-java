package com.sandersgutierrez.supermarket.domain.service;

import com.sandersgutierrez.supermarket.domain.repository.ProductRepository;
import com.sandersgutierrez.supermarket.util.ProductServiceDataTestUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    void t1() {
        ProductServiceDataTestUtils.getMockCategoryList().forEach(System.out::println);
        ProductServiceDataTestUtils.getMockProductList().forEach(System.out::println);
    }
}