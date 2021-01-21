package com.maitre.customerservice.domain.usecases

import com.maitre.customerservice.domain.port.out.persistence.CreateCustomerPort
import com.maitre.customerservice.domain.entity.Customer
import org.springframework.stereotype.Service

@Service
class CreateCustomerUseCase(val createCustomerPort: CreateCustomerPort) {


    fun execute(customer: Customer): Customer {
        return createCustomerPort.save(customer)
    }
}