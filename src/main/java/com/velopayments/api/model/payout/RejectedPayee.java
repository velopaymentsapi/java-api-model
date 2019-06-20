package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RejectedPayee {

    private String email;
    private UUID payeeId;
    private ReasonType reason;
    private String remoteId;
    private String description;
}
