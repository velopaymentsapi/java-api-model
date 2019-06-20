package com.velopayments.api.model.payout.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePayoutQuoteResponse {

    private List<FxSummary> fxSummaries = new ArrayList<>();

}
