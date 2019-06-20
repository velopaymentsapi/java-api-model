package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankPaymentChannelCountryRule {

    private String isoCountryCode;
    private List<BankPaymentChannelRule> rules;

}
