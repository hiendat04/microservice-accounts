package com.microservice.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Account number must be exactly 10 digits")
    private Long accountNumber;

    private Long customerId;

    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
