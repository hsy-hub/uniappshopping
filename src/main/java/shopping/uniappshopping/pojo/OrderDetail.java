package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class OrderDetail extends Order{
    private ProductDetail productDetail;
    private Address address;
    private Customer customer;
    private State state_;
    List<ProductStyle> styleList;
}
