package com.velopayments.api.model.payout.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitPayoutRequest {
    private UUID payorId;
    private String memo;
    private List<Payment> payments = new ArrayList<>();

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Payment {

        private String remoteId;
        private String currency;
        private BigDecimal amount;
        private String memo;
        private String sourceAccountName;
        private String payorPaymentId;
    }

}
