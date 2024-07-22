package productservicepro.mapper;

import productservicepro.dto.ProductResponseDTO;
import productservicepro.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setRating(product.getRating());
        responseDTO.setCategory(product.getCategory());
        return responseDTO;
    }
}
