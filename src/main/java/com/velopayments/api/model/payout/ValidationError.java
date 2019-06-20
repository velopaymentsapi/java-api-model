package com.velopayments.api.model.payout;

import lombok.Getter;

@Getter
public class ValidationError {

    private String field;
    private String errorMessage;

    public ValidationError(final String field, final String errorMessage) {
        this.field = field;
        this.errorMessage = errorMessage;
    }

}