package com.velopayments.api.model.payout.v2;

import com.velopayments.api.model.payout.RejectedCsvRow;
import lombok.Data;

import java.util.List;

@Data
public class SubmitCsvPayoutResponse extends SubmitPayoutResponse {
    private List<RejectedCsvRow> rejectedCsvRows;
}
