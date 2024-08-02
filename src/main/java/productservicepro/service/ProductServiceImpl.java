package productservicepro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productservicepro.dto.FakeStoreProductResponseDTO;
import productservicepro.entity.Product;
import productservicepro.exception.ProductNotFoundException;
import productservicepro.repository.ProductRepository;

import java.util.List;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{

    @Autowired
   private ProductRepository productRepository;

    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        return null;
    }

    @Override
    public FakeStoreProductResponseDTO getProduct(int id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    @Override
    public Product updateProduct(Product product, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
