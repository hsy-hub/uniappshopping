package shopping.uniappshopping.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping.uniappshopping.mapper.ProductMapper;
import shopping.uniappshopping.pojo.ProductDetail;
import shopping.uniappshopping.pojo.ProductDiscuss;
import shopping.uniappshopping.pojo.SaleProduct;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductDiscuss getProductById(Integer id) {
        return productMapper.getProductById(id);
    }

    @Override
    public List<ProductDetail> getProductList(HashMap map) {
        return productMapper.getProductList(map);
    }

    @Override
    public Integer selectProCount(String productName) {
        return productMapper.selectProCount(productName);
    }

    @Override
    public SaleProduct getSaleProduct(Integer id) {
        return productMapper.getSaleProduct(id);
    }
}

