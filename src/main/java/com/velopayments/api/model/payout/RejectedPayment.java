package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RejectedPayment {

    private String remoteId;
    private String currencyType;
    private BigDecimal amount;
    private String sourceAccountName;
    private String payorPaymentId;
    private ReasonType reason;
    private Long lineNumber;
}
