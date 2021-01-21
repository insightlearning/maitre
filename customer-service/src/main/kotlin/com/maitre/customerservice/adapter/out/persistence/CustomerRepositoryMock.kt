package com.maitre.customerservice.adapter.out.persistence

import org.springframework.stereotype.Component

@Component
class CustomerRepositoryMock: CustomerRepository {

    override fun save(customerEntity: CustomerEntity) {
        print("mock")
    }
}