package com.maitre.customerservice.adapter.out.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("customer")
data class CustomerEntity(
        @Id
        val id: String? = null,
        val name:String,
        val email:String,
        val phone: String,
)