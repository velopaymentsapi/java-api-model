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
public class FundingEventResponse {
    private UUID eventId;
    private ZonedDateTime eventDateTime;
    private FundingEventType fundingEventType;
    private String principal;
}
