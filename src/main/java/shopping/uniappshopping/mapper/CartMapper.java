package shopping.uniappshopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.CartDetail;
import shopping.uniappshopping.pojo.OrderDetail;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface CartMapper {
    public int addCart(Cart cart);
    public int deleteCartByIds(Integer[] ca_ids);
    public List<CartDetail> getCartDetailByCustomerId(HashMap map);
}
