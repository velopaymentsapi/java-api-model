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

import com.velopayments.api.model.ModelTest;
import com.velopayments.oa3.model.PayorV2;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

class GetPayorResponseTest extends ModelTest {

    @BeforeEach
    void setUp() throws IOException {
        jsonString = IOUtils.resourceToString("/payor/getPayorResponse.json", Charset.forName("UTF-8"));
    }

    @DisplayName("Test JSON Parse of GetPayorResponse")
    @Test
    void testJsonParse() throws IOException {
        PayorV2 response = objectMapper.readValue(jsonString, PayorV2.class);

        assertThat(response.getPayorId()).isNotNull();
        assertThat(response.getPayorName()).isNotBlank();
        assertThat(response.getAddress()).isNotNull();
        assertThat(response.getAddress().getLine1()).isNotBlank();
        assertThat(response.getAddress().getCity()).isNotBlank();
        assertThat(response.getAddress().getCountyOrProvince()).isNotBlank();
        assertThat(response.getAddress().getZipOrPostcode()).isNotBlank();
        assertThat(response.getAddress().getCountry()).isNotBlank();
        assertThat(response.getPrimaryContactName()).isNotBlank();
        assertThat(response.getPrimaryContactPhone()).isNotBlank();
        assertThat(response.getPrimaryContactEmail()).isNotBlank();
        assertThat(response.getKycState()).isNotNull();
        assertThat(response.getManualLockout()).isFalse();
        assertThat(response.getPayeeGracePeriodProcessingEnabled()).isTrue();
        assertThat(response.getPayeeGracePeriodDays()).isEqualTo(90);
        assertThat(response.getDbaName()).isNotBlank();
        assertThat(response.getAllowsLanguageChoice()).isFalse();
        assertThat(response.getReminderEmailsOptOut()).isFalse();
        assertThat(response.getLanguage()).isNotNull();
        assertThat(response.getIncludesReports()).isFalse();

    }
}