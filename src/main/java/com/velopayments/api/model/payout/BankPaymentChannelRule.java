package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankPaymentChannelRule {

    private String element;
    private boolean required;
    private String displayName;
    private int minLength;
    private int maxLength;
    private String validation;
    private Integer displayOrder;

}
