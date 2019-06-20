package com.velopayments.api.model.payout;

import com.velopayments.api.model.payout.v3.FxSummary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetQuoteResponse {

    private int expirationIntervalInSec;
    private ZonedDateTime quoteExpiry;
    private ZonedDateTime createdOn;
    private QuotationStatus status;
    private ZonedDateTime lastUpdatedOn;
    private List<FxSummary> quotedItems = new ArrayList<>();

    public enum QuotationStatus { CREATED } //note the enum being in upper case


}
