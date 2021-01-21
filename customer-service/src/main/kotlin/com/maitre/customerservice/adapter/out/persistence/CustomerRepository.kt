package com.maitre.customerservice.adapter.out.persistence

interface CustomerRepository {

    fun save(customerEntity: CustomerEntity)
}