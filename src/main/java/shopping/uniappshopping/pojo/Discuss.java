package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品评论
 */
@Data
@NoArgsConstructor
public class Discuss {
    private Integer id;
    private String nickName;
    private String time;
    private String content; //内容
    private String praise; //赞
    private Integer pid; //商品id
    private Integer sid;//类型id
    private ProductStyle productStyle;

}
