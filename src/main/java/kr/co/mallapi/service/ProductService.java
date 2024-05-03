package kr.co.mallapi.service;
import kr.co.mallapi.dto.PageRequestDTO;
import kr.co.mallapi.dto.PageResponseDTO;
import kr.co.mallapi.dto.ProductDTO;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface ProductService {

    PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);

    Long register(ProductDTO productDTO);

    ProductDTO get(Long pno);

    void modify(ProductDTO productDTO);

    void remove(Long pno);

}