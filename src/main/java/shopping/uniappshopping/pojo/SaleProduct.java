package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SaleProduct extends ProductDetail{
    public List<Categray> categrayList;
    public List<ProductStyle> styleList;
}
