package com.velopayments.api.model.payout.v3;

import com.velopayments.api.model.payout.SubReasonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RejectedPayment {

    private String remoteId;
    private String currencyType;
    private Long amount;
    private String sourceAccountName;
    private String payorPaymentId;
    private String reasonCode;
    private String reason;
    private Long lineNumber;
    private String message;
    private SubReasonType subReasonType;
}
