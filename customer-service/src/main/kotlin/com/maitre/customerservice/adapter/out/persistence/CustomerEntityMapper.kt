package com.maitre.customerservice.adapter.out.persistence

import com.maitre.customerservice.domain.entity.Customer
import org.springframework.stereotype.Component

@Component
class CustomerEntityMapper {

    fun toEntity(domainObject: Customer): CustomerEntity{
        return CustomerEntity(domainObject.id,domainObject.name,domainObject.email, domainObject.phone)
    }

    fun toDomain(entity: CustomerEntity): Customer {
        return Customer(entity.id,entity.name,entity.email, entity.phone)
    }
}