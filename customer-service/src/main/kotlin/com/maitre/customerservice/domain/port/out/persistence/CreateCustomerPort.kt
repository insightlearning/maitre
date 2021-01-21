package com.maitre.customerservice.domain.port.out.persistence

import com.maitre.customerservice.domain.entity.Customer

interface CreateCustomerPort {
    fun save(customer: Customer): Customer
}