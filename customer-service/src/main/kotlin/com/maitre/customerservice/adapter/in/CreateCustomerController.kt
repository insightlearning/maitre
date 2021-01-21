package com.maitre.customerservice.adapter.`in`

import com.maitre.customerservice.domain.usecases.CreateCustomerUseCase
import com.maitre.customerservice.domain.entity.Customer
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class CreateCustomerController(val createCustomerUseCase: CreateCustomerUseCase){


    @PostMapping("/customer")
    fun execute(@Valid @RequestBody customerDTO: CreateCustomerRequest): CreateCustomerRequest? {
      createCustomerUseCase.execute(customerDTO.toCustomer())
        return null
    }
}