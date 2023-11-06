package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeDTO;

public class CelcoinRechargeMapper {
    public static RechargeDTO toAppDTO(CelcoinRechargeDTO vendorDTO) {
        RechargeDTO appDTO = new RechargeDTO();

        appDTO.setDocument(vendorDTO.getCpfCnpj());
        appDTO.setId(vendorDTO.getProviderId());
        appDTO.setOperatorID(vendorDTO.getProviderId());
        // appDTO.setPhone(vendorDTO.getPhone());
        appDTO.setReceipt(null);
        appDTO.setSuccess(false);
        appDTO.setTransactionID(null);
        appDTO.setValue(null);

        return appDTO;
    }

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
    }
}
