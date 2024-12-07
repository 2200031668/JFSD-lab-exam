package com.klef.jfsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String FAKE_STORE_API_URL = "https://fakestoreapi.com/products";

    public List<Product> fetchAllProducts() {
        ResponseEntity<Product[]> response = restTemplate.getForEntity(FAKE_STORE_API_URL, Product[].class);
        return Arrays.asList(response.getBody());
    }
}
