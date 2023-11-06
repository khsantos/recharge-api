package com.fag.domain.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;

public class RechargeMapper {
    public static RechargeDTO toDTO(RechargeBO rechargeBO) {
        RechargeDTO rechargeDTO = new RechargeDTO();

        rechargeDTO.setDocument(rechargeBO.getDocument());
        rechargeDTO.setId(rechargeBO.getId());
        rechargeDTO.setOperatorID(rechargeBO.getProviderID());
        rechargeDTO.setPhone(rechargeBO.getPhone());
        rechargeDTO.setReceipt(rechargeBO.getReceipt());
        rechargeDTO.setSuccess(rechargeBO.isSuccess());
        rechargeDTO.setTransactionID(rechargeBO.getTransactionID());
        rechargeDTO.setValue(rechargeBO.getValue());

        return rechargeDTO;
    }

    public static RechargeBO toBO(RechargeDTO rechargeDTO) {
        RechargeBO rechargeBO = new RechargeBO(rechargeDTO.getId(), rechargeDTO.getValue(), rechargeDTO.getDocument(),
            rechargeDTO.getOperatorID(), rechargeDTO.getPhone(), rechargeDTO.getReceipt(), rechargeDTO.getTransactionID(), rechargeDTO.isSuccess());

        return rechargeBO;
    }
}
