package productservicepro.service;

import productservicepro.dto.FakeStoreProductResponseDTO;
import productservicepro.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int id);
    Product createProduct(Product product);
    Product updateProduct(Product product, int productId);
    boolean deleteProduct(int productId);
}
