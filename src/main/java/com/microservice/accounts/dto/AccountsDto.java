package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Account details of the customer to create account in the Accounts microservice"
)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Account number must be exactly 10 digits")
    @Schema(description = "Account number of the customer", example = "1234567890")
    private Long accountNumber;

    private Long customerId;

    @NotEmpty(message = "Account type cannot be null or empty")
    @Schema(description = "Type of the account, e.g., Savings, Current, etc.", example = "Savings")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    @Schema(description = "Branch address of the account", example = "123 Main St, Springfield")
    private String branchAddress;
}
