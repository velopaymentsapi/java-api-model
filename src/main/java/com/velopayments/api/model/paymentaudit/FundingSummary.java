package com.velopayments.api.model.paymentaudit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FundingSummary {
    private Long amount;
    private ZonedDateTime dateTime;
    private FundingStatus status;
    private String currency;
    private String sourceAccountName;
    private String fundingAccountName;
    private FundingType fundingType;
    private List<FundingEventResponse> events;
    private String topupType;
}
