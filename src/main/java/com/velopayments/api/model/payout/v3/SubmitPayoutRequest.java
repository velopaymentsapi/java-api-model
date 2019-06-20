package com.velopayments.api.model.payout.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitPayoutRequest {

    private UUID payorId;
    private String payoutMemo;
    private List<Payment> payments = new ArrayList<>();

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Payment {
        private String remoteId;
        private String currency;
        private Long amount;
        private String paymentMemo;
        private String sourceAccountName;
        private String payorPaymentId;
    }

}
