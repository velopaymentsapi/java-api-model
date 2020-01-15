package com.velopayments.api.model;

import com.velopayments.oa3.model.AcceptedPayment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AcceptedPaymentTest  {


    @Test
    void testCreateObj() {
        AcceptedPayment acceptedPayment = new AcceptedPayment()
                .remoteId("remote")
                .currencyType("USD")
                .amount(100)
                .sourceAccountName("SrcName")
                .payorPaymentId("1234")
                .paymentMemo("memo");

        assertNotNull(acceptedPayment);
        assertNotNull(acceptedPayment.getRemoteId());
        assertNotNull(acceptedPayment.getCurrencyType());
        assertNotNull(acceptedPayment.getAmount());
        assertNotNull(acceptedPayment.getSourceAccountName());
        assertNotNull(acceptedPayment.getPayorPaymentId());
        assertNotNull(acceptedPayment.getPaymentMemo());

    }
}
