package org.example._2023_09_29.mockito.test.stubTest;//package javaProf.unit.mockito.test.stubTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import javaProf.unit.mockito.stub.*;
//import org.junit.jupiter.api.Test;
//
//class SaboteurDemo {
//
//	@Test
//	public void testInvalidCustomer() {
//	  Customer customer = new Customer();
//	  CustomerRepository customerRepository = mock(CustomerRepository.class);
//
//	  when(customerRepository.getCustomerById(anyLong()))
//	    					 .thenThrow(new CustomerNotFoundException());
//
//	  CustomerService customerService = new SimpleCustomerService(customerRepository);
//	  assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
//	}
//}