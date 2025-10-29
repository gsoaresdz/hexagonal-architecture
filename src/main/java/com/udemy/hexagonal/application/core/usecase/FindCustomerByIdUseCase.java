package com.udemy.hexagonal.application.core.usecase;

import com.udemy.hexagonal.application.core.domain.Customer;
import com.udemy.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase {

    public final FindCustomerByIdOutputPort findCustomerByIdOutput;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutput) {
        this.findCustomerByIdOutput = findCustomerByIdOutput;
    }

    public Customer find(String id) {
        return findCustomerByIdOutput.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
