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
public class PayoutResponse {
    /**
     * The id (UUID) of the payout.
     */
    private UUID payoutId;

    /**
     * The id (UUID) of the payor making the payout.
     */
    private UUID payorId;

    /**
     * The date/time of instruction of the payout.
     */
    private ZonedDateTime dateTime;

    /**
     * The current status of the payout
     */
    private PayoutStatus status;

    /**
     * The payments which have been instructed as part of this payout.
     */
    private List<PaymentResponse> payments = new ArrayList<>();

    /**
     * Totals of stuff within the payout
     */
    private PayoutResponseSummary summary;
}
