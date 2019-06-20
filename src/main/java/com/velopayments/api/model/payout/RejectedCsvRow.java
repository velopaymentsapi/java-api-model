package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RejectedCsvRow {

    private long lineNumber;
    private String rejectedContent;
    private String message;
}
