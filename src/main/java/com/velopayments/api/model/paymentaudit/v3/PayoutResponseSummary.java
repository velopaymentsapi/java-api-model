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

package com.velopayments.api.model.paymentaudit.v3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayoutResponseSummary {

    private PayoutStatus payoutStatus;
    private ZonedDateTime submittedDateTime;
    private ZonedDateTime instructedDateTime;
    private ZonedDateTime withdrawnDateTime;
    private String payoutMemo;
    private Long totalPayments;
    private Long confirmedPayments;
    private Long releasedPayments;
    private Long incompletePayments;
    private Long failedPayments;
}
