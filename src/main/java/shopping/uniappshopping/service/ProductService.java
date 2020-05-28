package shopping.uniappshopping.service;


import shopping.uniappshopping.pojo.ProductDetail;
import shopping.uniappshopping.pojo.ProductDiscuss;
import shopping.uniappshopping.pojo.SaleProduct;

import java.util.HashMap;
import java.util.List;

public interface ProductService {
    public ProductDiscuss getProductById(Integer id);

    public List<ProductDetail> getProductList(HashMap map);

   public Integer selectProCount(String productName);
    public SaleProduct getSaleProduct(Integer id);
}
