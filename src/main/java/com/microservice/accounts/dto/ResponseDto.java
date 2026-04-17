package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Response details for the API operations in the Accounts microservice"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(description = "Status code of the API response")
    private String statusCode;

    @Schema(description = "Message describing the status of the API response")
    private String statusMsg;
}
