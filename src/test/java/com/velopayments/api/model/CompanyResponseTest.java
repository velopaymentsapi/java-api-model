package com.velopayments.api.model;

import com.velopayments.oa3.model.CompanyResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CompanyResponseTest {

    @Test
    void testCreateObj() {
        CompanyResponse companyResponse = new CompanyResponse()
                .name("name")
                .operatingName("opName");

        assertNotNull(companyResponse);
        assertNotNull(companyResponse.getName());
        assertNotNull(companyResponse.getOperatingName());
    }
}
