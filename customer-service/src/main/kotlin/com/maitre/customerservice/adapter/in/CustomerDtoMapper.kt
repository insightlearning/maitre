package com.maitre.customerservice.adapter.`in`

import com.maitre.customerservice.domain.entity.Customer
import org.springframework.stereotype.Component

@Component
class CustomerDtoMapper {

    fun toResponse(domainObject: Customer): CreateCustomerResponse {
        return CreateCustomerResponse(domainObject.id,domainObject.name,domainObject.email, domainObject.phone)
    }
}