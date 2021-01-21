package com.maitre.customerservice.adapter.`in`

import com.maitre.customerservice.domain.entity.Customer
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

data class CreateCustomerRequest(
        @field:NotBlank
        val name:String,
        @field:NotBlank
        @field:Email
        val email:String,
        @field:NotBlank
        val phone: String){


        fun toCustomer(): Customer {
                return Customer(name,email,phone)
        }


}

