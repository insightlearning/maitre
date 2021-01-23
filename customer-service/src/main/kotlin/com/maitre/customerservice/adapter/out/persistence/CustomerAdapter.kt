package com.maitre.customerservice.adapter.out.persistence

import com.maitre.customerservice.domain.entity.Customer
import com.maitre.customerservice.domain.port.out.persistence.CreateCustomerPort
import com.maitre.customerservice.domain.port.out.persistence.GetCustomerPort
import org.springframework.stereotype.Component

@Component
class CustomerAdapter(val customerRepository: CustomerRepository,
                      val customerEntityMapper: CustomerEntityMapper): CreateCustomerPort, GetCustomerPort {
    override fun save(customer: Customer): Customer {
        val customerEntity = customerEntityMapper.toEntity(customer)
        return customerEntityMapper.toDomain(customerRepository.save(customerEntity))
    }


    override fun getById(id: String): Customer {
        val customerEntity = customerRepository.findById(id)
        return customerEntityMapper.toDomain(customerEntity.get())
    }

}