package shopping.uniappshopping.service;

import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.Order;
import shopping.uniappshopping.pojo.OrderDetail;

import java.util.HashMap;
import java.util.List;

public interface OrderService {
    public int createOrder(Order order);
    public List<OrderDetail> getOrderByCustomerId(HashMap map);
    public int cancelOrder(Integer id);
    public int payOrder(Integer id);

}
