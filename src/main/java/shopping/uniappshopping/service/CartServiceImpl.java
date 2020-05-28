package shopping.uniappshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping.uniappshopping.mapper.CartMapper;
import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.CartDetail;

import java.util.HashMap;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartMapper cartMapper;

    @Override
    public int addCart(Cart cart) {
        return cartMapper.addCart(cart);
    }

    @Override
    public int deleteCartByIds(Integer[] ca_ids) {
        return cartMapper.deleteCartByIds(ca_ids);
    }

    @Override
    public List<CartDetail> getCartDetailByCustomerId(HashMap map) {
        return cartMapper.getCartDetailByCustomerId(map);
    }
}
