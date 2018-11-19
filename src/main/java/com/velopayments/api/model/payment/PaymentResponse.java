/*
 *
 *  * Copyright 2018 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.velopayments.api.model.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

    private UUID paymentId;
    private UUID payeeId;
    private UUID payorId;
    private UUID quoteId;
    private UUID sourceAccountId;
    private String remoteId;
    private Long sourceAmount;
    private String sourceCurrency;
    private Long paymentAmount;
    private String paymentCurrency;
    private BigDecimal rate;
    private BigDecimal invertedRate;
    private ZonedDateTime submittedDateTime;
    private PaymentStatus status;
    private BatchFundingStatus fundingStatus;
    private String routingNumber;
    private String accountNumber;
    private String iban;
    private String paymentMemo;
    private String filenameReference;
    private String individualIdentificationNumber;
    private String traceNumber;
    private String payorPaymentId;
    private UUID paymentChannelId;
    private String paymentChannelName;
    private String accountName;
}
