package productservicepro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productservicepro.exception.ProductNotFoundException;
import productservicepro.client.FakeStoreClient;
import productservicepro.dto.FakeStoreProductResponseDTO;
import productservicepro.entity.Product;

import java.util.List;

@Service("fakestore")
public class FakeStoreProductServiceImpl implements  ProductService{

    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProducts();
        return fakeStoreProducts;
    }

    @Override
    public FakeStoreProductResponseDTO getProduct(int id) throws ProductNotFoundException{
        FakeStoreProductResponseDTO product = fakeStoreClient.getProductById(id);
        if(product==null){
            throw new ProductNotFoundException("Product Not Found Exception");
        }
        return product;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
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
