package productservicepro.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import productservicepro.dto.FakeStoreProductResponseDTO;
import productservicepro.dto.ProductResponseDTO;

import java.util.List;

@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")
    private String fakeStoreAPIBaseURL;
    @Value("${fakeStore.api.product.path}")
    private String fakeStoreProductPath;

    public List<FakeStoreProductResponseDTO> getAllProducts(){
        String fakeStoreGetAllProductsURL = fakeStoreAPIBaseURL.concat(fakeStoreProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseList = restTemplate.getForEntity(fakeStoreGetAllProductsURL, FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());
    }

    public FakeStoreProductResponseDTO getProductById(int id){
        String fakeStoreGetProductURL = fakeStoreAPIBaseURL.concat(fakeStoreProductPath).concat("/"+id);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> productResponse = restTemplate.getForEntity(fakeStoreGetProductURL,FakeStoreProductResponseDTO.class);
        return productResponse.getBody();
    }


}
