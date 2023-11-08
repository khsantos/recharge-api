package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.mappers.RechargeMapper;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;

    IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO rechargeDTO) {
        RechargeBO bo = RechargeMapper.toBO(rechargeDTO);

        RechargeDTO rechargeResponse = vendor.create(rechargeDTO);

        if(rechargeResponse.isSuccess()) {
            bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionID());
        } else {
            bo.handleError();
        }

        dbRepository.persist(bo);

        return rechargeResponse;
    }
}
