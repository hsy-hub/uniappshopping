package shopping.uniappshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping.uniappshopping.mapper.OrderMapper;
import shopping.uniappshopping.pojo.Cart;
import shopping.uniappshopping.pojo.Order;
import shopping.uniappshopping.pojo.OrderDetail;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public int createOrder(Order order) {
        return orderMapper.createOrder(order);
    }

    @Override
    public List<OrderDetail> getOrderByCustomerId(HashMap map) {
        return orderMapper.getOrderByCustomerId(map);
    }

    @Override
    public int cancelOrder(Integer id) {
        return orderMapper.cancelOrder(id);
    }

    @Override
    public int payOrder(Integer id) {
        return orderMapper.payOrder(id);
    }


}
