package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
    
    public static PhoneDTO toDTO(PhoneBO phoneBO) {
        PhoneDTO phoneDto = new PhoneDTO();

        phoneDto.setCountryCode(phoneBO.getCountryCode());
        phoneDto.setNumber(phoneBO.getNumber());
        phoneDto.setStateCode(phoneBO.getStateCode());

        return phoneDto;
    }

    public static PhoneBO toBO(PhoneDTO phoneDTO) {
        PhoneBO phoneBO = new PhoneBO(phoneDTO.getStateCode(), phoneDTO.getCountryCode(), phoneDTO.getNumber());

        return phoneBO;
    }
}
