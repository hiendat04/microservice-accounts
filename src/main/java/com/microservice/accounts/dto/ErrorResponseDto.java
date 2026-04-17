package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Error response details for the API operations in the Accounts microservice"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(description = "Path of the API endpoint that caused the error", example = "/api/create")
    private String apiPath;

    @Schema(description = "HTTP status code representing the error")
    private HttpStatus errorCode;

    @Schema(description = "Message describing the error")
    private String errorMessage;

    @Schema(description = "Timestamp when the error occurred")
    private LocalDateTime errorTime;
}
