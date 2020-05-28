package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品信息
 */
@Data
@NoArgsConstructor
public class ProductDetail {
    private Integer id;
    private String productName;
    private String productPrice;
    private String sales; //售出
    private String image;
    private String image2;
    private String image3;
    private String styleid; //规格
    private String repositry; //库存
    private String description; //描述信息
}
