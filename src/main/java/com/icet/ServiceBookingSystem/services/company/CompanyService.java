package com.icet.ServiceBookingSystem.services.company;

import com.icet.ServiceBookingSystem.dto.AdDTO;

import java.io.IOException;

public interface CompanyService {

    boolean postAd(Long userId, AdDTO adDTO) throws IOException;

}
