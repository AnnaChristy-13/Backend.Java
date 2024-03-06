package consultations.consultation13.repository;


import consultations.consultation13.dto.ProductDto;
import consultations.consultation13.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);
}
