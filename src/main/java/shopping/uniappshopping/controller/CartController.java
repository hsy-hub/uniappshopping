package shopping.uniappshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.CartDetail;
import shopping.uniappshopping.service.CartService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class CartController {
    @Autowired
    CartService cartService;

    /**
     * 将选中的商品加入购物车
     * @param cart
     * @return
     */
    @PostMapping("/addCart")
    public Map<String, Object> addAddress(@RequestBody Cart cart) {
        Map<String, Object> map = new HashMap<>();
        int i = cartService.addCart(cart);
        if (i >=1) {
            map.put("result", i);
            map.put("code", 0);
            map.put("msg", "添加成功");
        } else if (i <1) {
            map.put("code", -1);
            map.put("msg", "添加失败");
            map.put("result", i);
        }
        return map;
    }

    @PostMapping("/getCartDetailByCustomerId")
    public Map<String, Object> getCartDetailByCustomerId(@RequestBody HashMap remap) {
        Map<String, Object> map = new HashMap<>();
        List<CartDetail> cartList = cartService.getCartDetailByCustomerId(remap);
        if (cartList !=null) {
            map.put("result", cartList);
            map.put("code", 0);
        } else if (cartList ==null) {
            map.put("code", -1);
            map.put("result", cartList);
        }
        return map;
    }

//    @PostMapping("/deleteCartByIds")
//    public Map<String, Object> deleteCartByIds(@RequestBody Integer[] ca_ids) {
//        Map<String, Object> map = new HashMap<>();
//        List<Integer> ca_idList = new ArrayList<>();
//        for (Integer ca_id:ca_ids){
//            ca_idList.add(ca_id);
//        }
//        int i = cartService.deleteCartByIds(ca_idList);
//        if (i >=1) {
//            map.put("result", i);
//            map.put("code", 0);
//        } else if (i <1) {
//            map.put("code", -1);
//            map.put("result", null);
//        }
//        return map;
//    }
}
