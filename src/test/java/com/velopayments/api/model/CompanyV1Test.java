package com.velopayments.api.model;

import com.velopayments.oa3.model.CompanyV1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CompanyV1Test {

    @Test
    void testCreateObj() {
        CompanyV1 company = new CompanyV1()
                .name("name")
                .taxId("id")
                .operatingName("opName");

        assertNotNull(company);
        assertNotNull(company.getName());
        assertNotNull(company.getTaxId());
        assertNotNull(company.getOperatingName());
    }
}
