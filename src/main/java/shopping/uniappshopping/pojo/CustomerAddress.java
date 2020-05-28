package shopping.uniappshopping.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CustomerAddress extends Customer{
    List<Address> addressList;
}
