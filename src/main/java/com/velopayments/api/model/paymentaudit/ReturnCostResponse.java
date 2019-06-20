package com.velopayments.api.model.paymentaudit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReturnCostResponse {
    private UUID associatedPaymentId;
    private ZonedDateTime createdTime;
    private long costAmount;
    private String currency;
    private String description;
    private ReturnCostType returnCostType;
}
