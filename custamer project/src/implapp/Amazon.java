package implapp;

import com.xworkz.ecommrce.Customer;
import com.xworkz.ecommrce.interfaceapp.ECommerce;

public class Amazon implements ECommerce {
  //has a relatinship
  
  Customer[] customer;
  int size;
  
  @Override
  public boolean addCustomers(Customer customer) {
  boolean isAdded=false;
  if(customer!=null){
    System.out.println("Customer is not null");
    if(customer.getCustomerName()!=null && !customer.getCustomerName().isEmpty()){
      this.customer[size]=customer;
      size++;
      isAdded=true;
      System.out.println("customerdata added successfull");
    }else {
      System.out.println("customer name is invalid");
    }
  }else {
    System.out.println("Customer name is null");
  }
    return isAdded;
  }
  
  @Override
  public void getAllCustomer() {
    System.out.println("invoked getAllCustmoers");
    System.out.println("list customers are");
    for(Customer cus:this.customer){
      System.out.println(cus);
      
    }
  
  }
  
  @Override
  public boolean updateCustomersMobileNoById(int existingId,long uplodeMobNo) {
    boolean isUpdated=false;
    if(existingId==0 && uplodeMobNo==0){
      for(Customer c:this.customer) {
        if (c.getCustomerId() == existingId) {
          c.setMobileNumber(uplodeMobNo);
          isUpdated = true;
          System.out.println("mobile number is updated sucessfully");
          System.out.println(c);
          
        }
      }
    }else{
      System.out.println("invalid existing id or updated mobile number");
    }
    
    return false;
  }
  
  @Override
  public boolean updateCustomerNameById(int exisingId,String updateCusomerName) {
    boolean isUpdated=false;
    if(exisingId==0 && updateCusomerName==null && !updateCusomerName.isEmpty()){
      for(Customer c:this.customer){
        if(c.getCustomerId()==exisingId) {
          c.setCustomerName(updateCusomerName);
          isUpdated = true;
          
        }
      }
      
    }else{
      System.out.println("invoked existing ID or update customer name");
    }
    return isUpdated;
  }
  
 
}
