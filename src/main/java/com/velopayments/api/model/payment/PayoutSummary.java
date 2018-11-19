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

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayoutSummary {

    private UUID payoutId;
    private UUID payorId;
    private PayoutStatus status;
    private ZonedDateTime submittedDateTime;
    private ZonedDateTime instructedDateTime;
    private Long totalPayments;
    private Long totalIncompletePayments;
    private Long totalFailedPayments;
    private List<SourceAccountSummary> sourceAccountSummary = new ArrayList<>();
    private List<FxSummary> fxSummaries = new ArrayList<>();
    private String payoutMemo;
}
