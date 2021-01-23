package com.maitre.customerservice.domain.port.out.persistence

import com.maitre.customerservice.domain.entity.Customer

interface GetCustomerPort {
    fun getById(id: String): Customer

}
