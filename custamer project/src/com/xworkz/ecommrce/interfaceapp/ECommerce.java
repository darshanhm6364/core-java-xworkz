package com.xworkz.ecommrce.interfaceapp;

import com.xworkz.ecommrce.Customer;

public interface ECommerce {
     
     
     boolean addCustomers(Customer customer);
     
     void getAllCustomer();
     
     boolean updateCustomersMobileNoById(int existingId, long uplodeMobNo);
     
     boolean updateCustomerNameById(int exisingId, String updateCusomerName);
}
