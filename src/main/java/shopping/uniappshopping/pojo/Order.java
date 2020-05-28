package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private Integer id;
    private String createTime;
    private Integer p_id;
    private Integer s1_id;
    private Integer s2_id;
    private Integer state;
    private Integer customer_id;
    private Integer ac_id;
}
