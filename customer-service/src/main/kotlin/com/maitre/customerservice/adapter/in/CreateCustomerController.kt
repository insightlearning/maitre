package com.maitre.customerservice.adapter.`in`

import com.maitre.customerservice.domain.usecases.CreateCustomerUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class CreateCustomerController(val createCustomerUseCase: CreateCustomerUseCase, val customerDtoMapper:CustomerDtoMapper){


    @PostMapping("/customer")
    fun execute(@Valid @RequestBody customerRequest: CreateCustomerRequest): CreateCustomerResponse {
        var customer = createCustomerUseCase.execute(customerRequest.toCustomer())
        return customerDtoMapper.toResponse(customer)
    }
}