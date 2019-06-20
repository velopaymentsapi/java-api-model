package com.velopayments.api.model.paymentaudit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayoutStatistics {

    private Long thisMonthPayoutsCount;
    private Long thisMonthFailedPaymentsCount;
}
