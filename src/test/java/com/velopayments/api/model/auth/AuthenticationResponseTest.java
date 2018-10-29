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

package com.velopayments.api.model.auth;

import com.velopayments.api.model.ModelTest;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

class AuthenticationResponseTest extends ModelTest {


    @BeforeEach
    void setUp() throws IOException {
        jsonString = IOUtils.resourceToString("/auth/authresponse.json", Charset.forName("UTF-8"));
    }

    @DisplayName("Test JSON Parse of Auth Response")
    @Test
    void testJsonParse() throws IOException {
        AuthenticationResponse response = objectMapper.readValue(jsonString, AuthenticationResponse.class);

        assertThat(response.getAccessToken()).isNotBlank();
        assertThat(response.getTokenType()).isNotBlank();
        assertThat(response.getExpiresIn()).isNotNull().isNotZero();
        assertThat(response.getScope()).isNotBlank();
    }
}