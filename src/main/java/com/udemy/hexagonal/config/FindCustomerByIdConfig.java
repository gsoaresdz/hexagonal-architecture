package com.udemy.hexagonal.config;

import com.udemy.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.udemy.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.udemy.hexagonal.adapters.out.InsertCustomerAdapter;
import com.udemy.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.udemy.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase (
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
