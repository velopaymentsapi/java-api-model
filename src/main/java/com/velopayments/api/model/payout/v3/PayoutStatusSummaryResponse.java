package com.velopayments.api.model.payout.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayoutStatusSummaryResponse {
    protected UUID payoutId;
    protected String status;
    protected Integer paymentsSubmitted;
    protected Integer paymentsAccepted;
    protected Integer paymentsRejected;
    protected List<FxSummary> fxSummaries;
    protected List<AccountCost> accounts;
    private List<RejectedPayment> rejectedPayments;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FxSummary {
        private UUID quoteId;
        private ZonedDateTime expiryTime;
        private ZonedDateTime creationTime;
        private BigDecimal rate;
        private BigDecimal invertedRate;
        private Long totalSourceAmount;
        private Long totalPaymentAmount;
        private String sourceCurrency;
        private String paymentCurrency;
        private String status;
        private String fundingStatus;
    }

    /**
     * Details of the effect of the payout on a particular account
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AccountCost {
        private String sourceAccountName;
        private UUID sourceAccountId;
        private String currency;
        private Long totalPayoutCost;
    }
}
