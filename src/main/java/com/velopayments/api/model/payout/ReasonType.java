package com.velopayments.api.model.payout;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
public enum ReasonType {

    UNKNOWN_REMOTE_ID("UNKNOWN_REMOTE_ID"),

    UNKNOWN_SOURCE_ACCOUNT("UNKNOWN_SOURCE_ACCOUNT"),

    UNSUPPORTED_CURRENCY("UNSUPPORTED_CURRENCY"),

    PAYMENT_VALUE_TOO_HIGH("PAYMENT_VALUE_TOO_HIGH"),

    UNSUPPORTED_COUNTRY("UNSUPPORTED_COUNTRY"),

    UNSUPPORTED_CURRENCY_FOR_COUNTRY("UNSUPPORTED_CURRENCY_FOR_COUNTRY"),

    PAYEE_NOT_ONBOARDED("PAYEE_NOT_ONBOARDED"),

    COMPLIANCE_ISSUE("COMPLIANCE_ISSUE"),

    DUPLICATE_PAYOR_PAYMENT_ID("DUPLICATE_PAYOR_PAYMENT_ID"),

    CURRENCY_MISMATCH("CURRENCY_MISMATCH"),

    DECLINED_INVITE("DECLINED_INVITE"),

    PENDING_INVITE("PENDING_INVITE"),

    OFAC_FAILED("OFAC_FAILED"),

    BADLY_FORMED_DATA_ROW("BADLY_FORMED_DATA_ROW"),

    OTHER("OTHER");

    private String value;

    ReasonType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonType fromValue(String value) {
        for (ReasonType b : ReasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
