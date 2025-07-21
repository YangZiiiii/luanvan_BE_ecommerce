package com.ecommerce.app.model.dao.response.projection;

import com.ecommerce.app.utils.Enum.Status;

public interface BrandProjection {
    String getId();
    String getName();
    Integer getStatus();
    Integer getTotalProduct();
}
