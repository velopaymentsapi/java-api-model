package com.velopayments.api.model.payout;

import lombok.Getter;

@Getter
public class ServiceError {

    private String message;
    private String detailMessage;

    public ServiceError(final String message, final String detailMessage) {
        this.message = message;
        this.detailMessage = detailMessage;
    }


}