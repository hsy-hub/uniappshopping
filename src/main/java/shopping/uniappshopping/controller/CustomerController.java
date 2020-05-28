package shopping.uniappshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopping.uniappshopping.pojo.Address;
import shopping.uniappshopping.pojo.Customer;
import shopping.uniappshopping.pojo.CustomerAddress;
import shopping.uniappshopping.service.CustomerService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/login")
    public Map<String, Object> Login(@RequestBody Customer customer) {
        Map<String, Object> map = new HashMap<>();
        Customer loginUser = customerService.login(customer);
        if (loginUser != null) {
//            String token = JwtUtil.sign(loginUser);
            map.put("result", loginUser);
            map.put("code", 0);
            map.put("msg", "登录成功");
//            map.put("token", token);//传给前端
//            System.out.println("token>>>" + token);
        } else if (loginUser == null) {
            map.put("code", -1);
            map.put("msg", "用户名密码不正确");
            map.put("result", loginUser);
        }
        return map;
    }

    /**
     * 根据用户的id 得到用户绑定的发货地址
     * @param id 用户id
     * @return Map<String, Object>
     */
    @GetMapping("/getCustomerAddressDefault/{id}")
    public Map<String, Object> getCustomerAddressDefault(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        CustomerAddress customerAddress = customerService.getCustomerAddressDefault(id);
        if (customerAddress != null) {
            map.put("result", customerAddress);
            map.put("code", 0);
        } else if (customerAddress == null) {
            map.put("code", -1);
            map.put("result", customerAddress);
        }
        return map;
    }

    /**
     * 根据用户的id 得到用户绑定的发货地址
     * @param id 用户id
     * @return Map<String, Object>
     */
    @GetMapping("/getCustomerAddressAll/{id}")
    public Map<String, Object> getCustomerAddressAll(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        CustomerAddress customerAddress = customerService.getCustomerAddressAll(id);
        if (customerAddress != null) {
            map.put("result", customerAddress);
            map.put("code", 0);
        } else if (customerAddress == null) {
            map.put("code", -1);
            map.put("result", customerAddress);
        }
        return map;
    }

    /**
     * 更新用户的收货地址
     * 如果地址里的默认地址是true 那么先调用
     * updateAddressDefaultFalse 更新所有的地址状态为false
     * updateAddressDefaultTrue 改变当前地址的状态
     * @param address
     * @return
     */
    @PostMapping("/updateAddress")
    public Map<String, Object> updateAddress(@RequestBody Address address) {
        Map<String, Object> map = new HashMap<>();
        int i = customerService.updateAddress(address);
        if (address.getDefault_()){
            customerService.updateAddressDefaultFalse(address.getCid());
            customerService.updateAddressDefaultTrue(address.getAc_id());
        }
        if (i >=1) {
            map.put("result", i);
            map.put("code", 0);
            map.put("msg", "修改成功");
        } else if (i <1) {
            map.put("code", -1);
            map.put("msg", "修改失败");
            map.put("result", i);
        }
        return map;
    }

//    @PostMapping("/updateAddressDefault")
//    public Map<String, Object> updateAddressDefault(@RequestBody Integer cid) {
//        Map<String, Object> map = new HashMap<>();
//        int i = customerService.updateAddressDefaultFalse(cid);
//        if (i >1) {
//            map.put("result", i);
//            map.put("code", 0);
//            map.put("msg", "修改成功");
//        } else if (i <1) {
//            map.put("code", -1);
//            map.put("msg", "修改失败");
//            map.put("result", i);
//        }
//        return map;
//    }

    /**
     * 添加收货地址的逻辑
     * @param address
     * @return
     */
    @PostMapping("/addAddress")
    public Map<String, Object> addAddress(@RequestBody Address address) {
        Map<String, Object> map = new HashMap<>();
        if (address.getDefault_()==null){
            address.setDefault_(false);
        }
        if (address.getDefault_()){
            customerService.updateAddressDefaultFalse(address.getCid());
        }
        int i = customerService.addAddress(address);
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
}
