package com.velopayments.api.model.payout.v2;

import com.velopayments.api.model.payout.RejectedPayment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitPayoutResponse {
    protected UUID payoutId;
    protected List<FxSummary> fxSummaries;
    protected List<AccountCost> accounts;
    private List<RejectedPayment> rejectedPayments;

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
        private BigDecimal totalPayoutCost;
    }
}
