package com.app.sonatrach.handlers;

import com.app.sonatrach.exceptions.ErrorCodes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ErrorDto {
    private Integer httpCode;
    private ErrorCodes code;
    private String message;
    private List<String> errors = new ArrayList<>();
}