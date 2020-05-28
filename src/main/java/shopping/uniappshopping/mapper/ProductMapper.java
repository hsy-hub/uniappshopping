package shopping.uniappshopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import shopping.uniappshopping.pojo.ProductDetail;
import shopping.uniappshopping.pojo.ProductDiscuss;
import shopping.uniappshopping.pojo.SaleProduct;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    public ProductDiscuss getProductById(Integer id);
    public List<ProductDetail> getProductList(HashMap map);
    public Integer selectProCount(String productName);
    public SaleProduct getSaleProduct(Integer id);
}
