package shopping.uniappshopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import shopping.uniappshopping.pojo.Address;
import shopping.uniappshopping.pojo.Customer;
import shopping.uniappshopping.pojo.CustomerAddress;

@Mapper
@Repository
public interface CustomerMapper {
    public Customer login(Customer customer);
public CustomerAddress getCustomerAddressDefault(Integer id);
    public CustomerAddress getCustomerAddressAll(Integer id);

    public int updateAddress(Address address);
    public int updateAddressDefaultFalse(Integer cid);
    public int updateAddressDefaultTrue(Integer c_id);
    public int addAddress(Address address);
}
