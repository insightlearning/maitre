package com.maitre.customerservice.adapter.out.persistence

import com.maitre.customerservice.domain.entity.Customer
import com.maitre.customerservice.domain.port.out.persistence.CreateCustomerPort
import com.maitre.customerservice.domain.port.out.persistence.DeleteCustomerPort
import org.springframework.stereotype.Component

@Component
class CustomerAdapter(val customerRepository: CustomerRepository,
                      val customerEntityMapper: CustomerEntityMapper): CreateCustomerPort, DeleteCustomerPort{
    override fun save(customer: Customer): Customer {
        val customerEntity = customerEntityMapper.toEntity(customer)
        customerRepository.save(customerEntity)
        return customer;
    }

    override fun delete(Customer: Customer): Customer {
        TODO("Not yet implemented")
    }

}