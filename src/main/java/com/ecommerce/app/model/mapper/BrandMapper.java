package com.ecommerce.app.model.mapper;

import com.ecommerce.app.model.dao.response.dto.BrandResponse;
import com.ecommerce.app.model.dao.response.dto.CategoryResponse;
import com.ecommerce.app.model.entity.Brand;
import com.ecommerce.app.model.entity.Category;

public class BrandMapper {
    public static BrandResponse toBrandResponse(Brand brand) {
        BrandResponse response = new BrandResponse();
        response.setId(brand.getId());
        response.setName(brand.getName());
        response.setSlug(brand.getSlug());
        response.setStatus(brand.getStatus());
        return response;
    }
}
