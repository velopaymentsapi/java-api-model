package com.velopayments.api.model.paymentaudit.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayoutSummary {
    private UUID payoutId;
    private UUID payorId;
    private PayoutStatus status;
    private ZonedDateTime submittedDateTime;
    private ZonedDateTime instructedDateTime;
    private ZonedDateTime withdrawnDateTime;
    private Long totalPayments;
    private Long totalIncompletePayments;
    private Long totalFailedPayments;
    private List<SourceAccountSummary> sourceAccountSummary = new ArrayList<>();
    private List<FxSummary> fxSummaries = new ArrayList<>();
    private String payoutMemo;
}
