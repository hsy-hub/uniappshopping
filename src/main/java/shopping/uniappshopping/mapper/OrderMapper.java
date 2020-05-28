package shopping.uniappshopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import shopping.uniappshopping.pojo.Order;
import shopping.uniappshopping.pojo.OrderDetail;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    public int createOrder(Order order);
    public List<OrderDetail> getOrderByCustomerId(HashMap map);
    public int cancelOrder(Integer id);
    public int payOrder(Integer id);

}
