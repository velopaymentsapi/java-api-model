package com.velopayments.api.model.paymentaudit;

import com.velopayments.api.model.Link;
import com.velopayments.api.model.Page;
import com.velopayments.api.model.paymentaudit.v3.PaymentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFundingsResponse {
    private List<Link> links;
    private Page page;
    private List<FundingSummary> content;
}
