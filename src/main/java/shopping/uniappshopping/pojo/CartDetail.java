package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDetail extends Cart{
    private ProductDetail productDetail;
    private ProductStyle productStyle;
}
