package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);
}
