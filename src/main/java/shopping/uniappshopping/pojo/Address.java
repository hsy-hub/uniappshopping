package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户地址
 */
@Data
@NoArgsConstructor
public class Address {
    private Integer ac_id;
    private String address;
    private Integer cid; //用户的外键
    private String receiver; //收货人
    private String mobile; //联系方式
    private String area; //门牌号
    private Boolean default_; //是否设为默认
}
