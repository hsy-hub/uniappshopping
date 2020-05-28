package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品规格
 */
@Data
@NoArgsConstructor
public class ProductStyle {
    private Integer id;
    private String styleName;
    private Integer pid; //商品id
    private Integer ca_id; //商品id
    private Integer o_id;
}
