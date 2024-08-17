package com.example.demo.util;

import com.example.demo.model.product;

import java.util.List;

public class PaginationUtil {

    public static List<product> paginate(List<product> products, int pageSize, int page) {
        int start = page * pageSize;
        int end = Math.min(start + pageSize, products.size());
        return products.subList(start, end);
    }
}