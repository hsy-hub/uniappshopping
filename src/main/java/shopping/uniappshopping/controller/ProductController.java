package shopping.uniappshopping.controller;


import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import shopping.uniappshopping.pojo.ProductDetail;
import shopping.uniappshopping.pojo.ProductDiscuss;
import shopping.uniappshopping.pojo.SaleProduct;
import shopping.uniappshopping.service.ProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    //获得商品详情
    @GetMapping("getProductById/{id}")
    public Map<String, Object> getProductById(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        ProductDiscuss productDiscuss = productService.getProductById(id);
        if (productDiscuss != null) {
            map.put("code", 0);
            map.put("result", productDiscuss);
        }else{
            map.put("code", -1);
            map.put("result", null);
        }
        return map;
    }

    @PostMapping("getProPageSearch")
    public Map<String, Object> getProductList(String productName, Integer currentPage, Integer pageSize) {
// 可选的int参数“currentPage,pageSize的类型”存在，但由于被声明为基元类型，因此无法转换为空值.而上面代码参数currentPage,pageSize的类型 为 int，它接受不了null值。
// 解决方法:将int 改为 对象类型 Integer
        HashMap map = new HashMap();
        Map<String, Object> remap = new HashMap<>();
        Integer pageStart = (currentPage-1)*pageSize;
        map.put("pageStart", pageStart);
        map.put("pageSize", pageSize);
        map.put("productName", productName);
        List<ProductDetail> productList = productService.getProductList(map);
        if (productList != null) {
            remap.put("code", 0);
            remap.put("data", productList);
        } else {
            remap.put("code", -1);
            remap.put("msg", "请登录");
        }
        return remap;
    }


    @GetMapping("getProCount")
    public Map<String, Object> selectProCount(String productName) {
        Map<String, Object> map = new HashMap<>();
        Integer count = productService.selectProCount(productName);
        if (count != null) {
            map.put("code", 0);
            map.put("result", count);
        }
        return map;
    }


    /**
     * 得到要购买的商品的参数
     * @param id
     * @return
     */
    @GetMapping("getSaleProduct/{id}")
    public Map<String, Object> getSaleProduct(@PathVariable Integer id) {
        Map<String, Object> map = new HashMap<>();
        SaleProduct saleProduct = productService.getSaleProduct(id);
        if (saleProduct != null) {
            map.put("code", 0);
            map.put("result", saleProduct);
        } else {
            map.put("code", -1);
            map.put("result", null);
        }
        return map;
    }
}
