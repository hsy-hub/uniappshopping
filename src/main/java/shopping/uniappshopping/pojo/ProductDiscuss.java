package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductDiscuss extends ProductDetail {
    List<Discuss> discussList;
}
