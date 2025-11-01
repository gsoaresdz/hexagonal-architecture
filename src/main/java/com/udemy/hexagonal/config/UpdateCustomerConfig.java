package com.udemy.hexagonal.config;

import com.udemy.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.udemy.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.udemy.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.udemy.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.udemy.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdAdapter,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(
                findCustomerByIdAdapter,
                findAddressByZipCodeAdapter,
                updateCustomerAdapter
        );
    }
}
