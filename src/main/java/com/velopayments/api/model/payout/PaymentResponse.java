package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

    private UUID paymentId;
    private UUID payorId;
    private UUID payoutId;
    private UUID payeeId;
    private String remoteId;
    private String currency;
    private Long amount;
    private String memo;
}
