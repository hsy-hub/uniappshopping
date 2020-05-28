package shopping.uniappshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopping.uniappshopping.pojo.Order;
import shopping.uniappshopping.pojo.OrderDetail;
import shopping.uniappshopping.service.OrderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 创建订单的逻辑
     * @param order
     * @return
     */
    @PostMapping("/createOrder")
    public Map<String, Object> createOrder(@RequestBody Order order) {
        Map<String, Object> map = new HashMap<>();

        orderService.createOrder(order);
        int order1 = order.getId();
        if (order1 >=1) {
            map.put("result", order1);
            map.put("code", 0);
        } else if (order1 <1) {
            map.put("code", -1);
            map.put("result", order1);
        }
        return map;
    }

    /**
     * 根据登录用户id
     * @param remap
     * @return
     */
    @PostMapping("/getOrderByCustomerId")
    public Map<String, Object> getOrderByCustomerId(@RequestBody HashMap remap) {
        Map<String, Object> map = new HashMap<>();
        List<OrderDetail> orderList = orderService.getOrderByCustomerId(remap);
        if (orderList !=null) {
            map.put("result", orderList);
            map.put("code", 0);
        } else if (orderList ==null) {
            map.put("code", -1);
            map.put("result", orderList);
        }
        return map;
    }

    /**
     * 根据订单id删除订单
     * @param id
     * @return
     */
    @GetMapping("/cancelOrder/{id}")
    public Map<String, Object> cancelOrder(@PathVariable("id") Integer id){
        Map<String, Object> map = new HashMap<>();
        int i = orderService.cancelOrder(id);
        if (i ==1) {
            map.put("result", i);
            map.put("code", 0);
            map.put("msg", "取消成功");
        } else if (i <1) {
            map.put("code", -1);
            map.put("result", i);
            map.put("msg", "取消失败");
        }
        return map;
    }

    /**
     * 根据订单id进行商品结算
     * @param id
     * @return
     */
    @GetMapping("/payOrder/{id}")
    public Map<String, Object> payOrder(@PathVariable("id") Integer id){
        Map<String, Object> map = new HashMap<>();
        int i = orderService.payOrder(id);
        if (i >=1) {
            map.put("result", i);
            map.put("code", 0);
        } else if (i <1) {
            map.put("code", -1);
            map.put("result", i);
        }
        return map;
    }
}
