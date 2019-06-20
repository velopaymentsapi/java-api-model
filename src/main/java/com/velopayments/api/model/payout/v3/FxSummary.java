package com.velopayments.api.model.payout.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FxSummary {

    private BigDecimal rate;
    private BigDecimal invertedRate;
    private ZonedDateTime creationTime;
    private ZonedDateTime expiryTime;
    private UUID quoteId;
    private Long totalSourceAmount;
    private Long totalPaymentAmount;
    private String sourceCurrency;
    private String paymentCurrency;

}