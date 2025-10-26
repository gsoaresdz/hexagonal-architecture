package com.udemy.hexagonal.application.ports.out;

import com.udemy.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
