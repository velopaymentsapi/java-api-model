package com.velopayments.api.model.payout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String city;
    private String countyOrProvince;
    private String zipOrPostcode;
    private String country;

}
