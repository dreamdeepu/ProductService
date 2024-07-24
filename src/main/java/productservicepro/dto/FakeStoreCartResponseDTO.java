package productservicepro.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FakeStoreCartResponseDTO {
    private String id;
    private String userId;
    private String date;
    private List<FakeStoreCartResponseDTO> products;
    private int __v;
}
