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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.velopayments.api.model.ModelTest;
import com.velopayments.oa3.model.PayorCreateApiKeyRequest;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CreateKeyRequestTest extends ModelTest {

    @BeforeEach
    void setUp() throws IOException {
        jsonString = IOUtils.resourceToString("/payor/createKeyRequest.json", Charset.forName("UTF-8"));

    }

    @DisplayName("Test JSON Parse of Create Key Request")
    @Test
    void testJsonParse() throws IOException {
        PayorCreateApiKeyRequest request = objectMapper.readValue(jsonString, PayorCreateApiKeyRequest.class);

        assertThat(request.getName()).isNotBlank();
        assertThat(request.getDescription()).isNotBlank();
        assertThat(request.getRoles()).isNotEmpty();
    }

    @DisplayName("Test Marshal to JSON for Create Key Request")
    @Test
    void testJsonMarshal() throws JsonProcessingException, JSONException {
        PayorCreateApiKeyRequest request = new PayorCreateApiKeyRequest();
        request.name("foo");
        request.description("a foo key");
        request.roles(Arrays.asList(PayorCreateApiKeyRequest.RolesEnum.ADMIN));

        String generatedJson = objectMapper.writeValueAsString(request);

        JSONAssert.assertEquals(jsonString, generatedJson,false);
    }
}