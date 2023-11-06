package com.fag.presentation;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendorRepository;
import com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import com.fag.infra.celcoin.mappers.CelcoinRechargeMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RechargeCelcoin implements IRechargeVendorRepository{

    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge) {

        try {
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toAppDTO(recharge);
        } catch (Exception e) {
            
        }
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listOperators'");
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listProducts'");
    }
}
