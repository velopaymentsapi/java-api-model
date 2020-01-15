package com.velopayments.api.model;

import com.velopayments.oa3.model.CreateFundingAccountRequest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateFundingAccountRequestTest {

    @Test
    void createObjTest() {
        CreateFundingAccountRequest request = new CreateFundingAccountRequest()
                .accountName("acctName")
                .accountNumber("acct")
                .routingNumber("123")
                .payorId(UUID.randomUUID());

        assertNotNull(request);
        assertNotNull(request.getAccountName());
        assertNotNull(request.getAccountNumber());
        assertNotNull(request.getRoutingNumber());
        assertNotNull(request.getPayorId());

    }
}
