package com.velopayments.api.model;

import com.velopayments.oa3.model.AutoTopUpConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AutoTopUpConfigTest {

    @Test
    void testCreateObj() {
        AutoTopUpConfig autoTopUpConfig = new AutoTopUpConfig()
                .enabled(true)
                .minBalance(100L)
                .targetBalance(1000l);

        assertNotNull(autoTopUpConfig);
        assertNotNull(autoTopUpConfig.getEnabled());
        assertNotNull(autoTopUpConfig.getMinBalance());
        assertNotNull(autoTopUpConfig.getTargetBalance());
    }
}
