package com.maitre.customerservice.domain.port.out.persistence

import com.maitre.customerservice.domain.entity.Customer

interface DeleteCustomerPort {
    fun delete(Customer: Customer): Customer
}