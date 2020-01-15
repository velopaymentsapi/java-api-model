package com.velopayments.api.model;

import com.velopayments.oa3.model.Challenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChallengeTest {

    @Test
    void testCreateObj() {
        Challenge challenge = new Challenge()
                .value("value")
                .description("Descript");

        assertNotNull(challenge);
        assertNotNull(challenge.getValue());
        assertNotNull(challenge.getDescription());
    }
}
