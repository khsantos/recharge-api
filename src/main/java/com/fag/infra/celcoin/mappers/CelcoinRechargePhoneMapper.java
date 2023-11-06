package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
    public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendorDTO) {
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendorDTO.getNumber());
        appDTO.setStateCode(vendorDTO.getStateCode());

        return appDTO;
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());
        vendorDTO.setStateCode(appDTO.getStateCode());

        return vendorDTO;
    }
}
