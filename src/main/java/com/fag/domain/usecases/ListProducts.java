package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.ProductDTO;
import com.fag.domain.repositories.IRechargeVendorRepository;

public class ListProducts {
    private IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
        List<ProductDTO> productDto = vendor.listProducts(stateCode, operatorId);

        return productDto;
    }
}
