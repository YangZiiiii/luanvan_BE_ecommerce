package com.ecommerce.app.model.dao.request;

import com.ecommerce.app.utils.Enum.Status;
import lombok.Data;

@Data
public class BrandForm {
    private String name;
    private String description;
    private Status status;
}
