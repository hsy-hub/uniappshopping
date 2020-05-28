package shopping.uniappshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping.uniappshopping.mapper.CustomerMapper;
import shopping.uniappshopping.pojo.Address;
import shopping.uniappshopping.pojo.Customer;
import shopping.uniappshopping.pojo.CustomerAddress;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public Customer login(Customer customer) {
        return customerMapper.login(customer);
    }

    @Override
    public CustomerAddress getCustomerAddressDefault(Integer id) {
        return customerMapper.getCustomerAddressDefault(id);
    }

    @Override
    public CustomerAddress getCustomerAddressAll(Integer id) {
        return customerMapper.getCustomerAddressAll(id);
    }

    @Override
    public int updateAddress(Address address) {
        return customerMapper.updateAddress(address);
    }

    @Override
    public int updateAddressDefaultFalse(Integer cid) {
        return customerMapper.updateAddressDefaultFalse(cid);
    }

    @Override
    public int updateAddressDefaultTrue(Integer ac_id) {
        return customerMapper.updateAddressDefaultTrue(ac_id);
    }

    @Override
    public int addAddress(Address address) {
        return customerMapper.addAddress(address);
    }


}
