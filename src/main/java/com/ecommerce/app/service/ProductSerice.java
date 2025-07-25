package com.ecommerce.app.service;

import com.ecommerce.app.model.dao.request.ProductForm;
import com.ecommerce.app.model.dao.response.dto.ProductResponse;
import com.ecommerce.app.model.dao.response.projection.ProductProjection;
import com.ecommerce.app.model.entity.Product;
import com.ecommerce.app.model.entity.Variant.VariantType;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ProductSerice {
    Page<ProductProjection> findAll(int page, int size, String sortBy, String direction);
    Product save(Product product);
    Product create(ProductForm form);
    ProductResponse update(String id, ProductForm form);
    Product uploadImage(String id, List<MultipartFile> files);
    void delete(String id);
    Optional<Product> findById(String id);
    ProductResponse getProductById(String id);
    ProductResponse findBySlug(String slug);
    void changeStatus(String id);

    List<ProductResponse> search(Double keywordInt1,String keyword);

    List<ProductResponse> searchProductByPrice(Double keyword, Double keyword1);

    List<ProductResponse> searchProductsByKeywords(String keyword);



    ProductResponse getProductDetail(String slug);
    Page<ProductResponse> getTopViewedProducts(int page, int size, String direction);

    Page<ProductResponse> getNewestProducts(int page, int size);

    Page<ProductResponse>  getTopRatedProducts(int page, int size);

    void updateProductRating(String productId);

    List<String> uploadImagesToProduct(String productId, List<MultipartFile> files);
    void removeImagesFromProduct(String productId);


    List<String> uploadImagesToVariant(String variantId,String productId, List<MultipartFile> files);

    /**Variant Type*/
    List<VariantType> getVariantTypes();
    Optional<VariantType> getVariantType(Long id);
    VariantType createVariantType(VariantType variantType);
    VariantType updateVariantType(String id, VariantType variantType);

}
