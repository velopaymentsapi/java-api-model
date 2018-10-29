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

package com.velopayments.api.model.payor;

import com.velopayments.api.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Response object from Get Payor API
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetPayorResponse {

    private UUID payorId;
    private String payorName;
    private Address address;
    private String primaryContactName;
    private String primaryContactPhone;
    private String primaryContactEmail;
    private String fundingAccountRoutingNumber;
    private String fundingAccountAccountNumber;
    private String fundingAccountAccountName;
    private KycStateEnum kycState;
    private Boolean manualLockout;
    private Boolean payeeGracePeriodProcessingEnabled;
    private Integer payeeGracePeriodDays;
    private String collectiveAlias;
    private String supportContact;
    private String dbaName;
    private Boolean allowsLanguageChoice;
    private Boolean reminderEmailsOptOut;
    private String language;
    private Boolean includesReports;
}
