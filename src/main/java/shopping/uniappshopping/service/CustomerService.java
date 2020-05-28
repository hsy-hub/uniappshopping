package shopping.uniappshopping.service;

import shopping.uniappshopping.pojo.Address;
import shopping.uniappshopping.pojo.Customer;
import shopping.uniappshopping.pojo.CustomerAddress;

public interface CustomerService {
    public Customer login(Customer customer);
    public CustomerAddress getCustomerAddressDefault(Integer id);
    public CustomerAddress getCustomerAddressAll(Integer id);
    public int updateAddress(Address address);
    public int updateAddressDefaultFalse(Integer cid);
    public int updateAddressDefaultTrue(Integer ac_id);
    public int addAddress(Address address);
}
