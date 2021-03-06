package com.velopayments.api.model.paymentaudit;

public enum FundingEventType {
    UNKNOWN_FUNDS_DETECTED,
    PAYOR_FUNDING_DETECTED,
    PAYOR_FUNDING_REQUESTED,
    PAYOR_FUNDING_RETURN_RECEIVED,
    FUNDING_RETURN_DETECTED,
    PAYOR_FUNDING_REQUEST_SUBMITTED,
    PAYOR_FUNDING_ENTRY_DETAIL_RECEIVED,
    FUNDING_DEALLOCATED,
    FUNDING_HIDDEN,
    FUNDING_UNHIDDEN
}
