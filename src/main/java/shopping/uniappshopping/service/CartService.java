package shopping.uniappshopping.service;

import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.CartDetail;

import java.util.HashMap;
import java.util.List;

public interface CartService {
    public int addCart(Cart cart);
    public int deleteCartByIds(Integer[] ca_ids);
    public List<CartDetail> getCartDetailByCustomerId(HashMap map);
}
