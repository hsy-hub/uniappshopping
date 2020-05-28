package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 */
@Data
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String nickName; //昵称
    private String password;
    private String email;
    private String phone; //联系方式
    private String headPath;
}
