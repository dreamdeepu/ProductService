package productservicepro.service;

import productservicepro.exception.ProductNotFoundException;
import productservicepro.dto.FakeStoreProductResponseDTO;
import productservicepro.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int id) throws ProductNotFoundException;
    Product createProduct(Product product);
    Product updateProduct(Product product, int productId);
    boolean deleteProduct(int productId);
}
