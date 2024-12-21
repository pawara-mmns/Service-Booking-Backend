package com.icet.ServiceBookingSystem.services.client;

import com.icet.ServiceBookingSystem.dto.AdDTO;
import com.icet.ServiceBookingSystem.dto.AdDetailsForClientDTO;
import com.icet.ServiceBookingSystem.dto.ReservationDTO;

import java.util.List;

public interface ClientService {

    List<AdDTO> getAllAds();

    List<AdDTO> searchAdByName(String name);

    boolean bookService(ReservationDTO reservationDTO);

    AdDetailsForClientDTO getAdDetailsByAdId(Long adId);

    List<ReservationDTO> getAllBookingsByUserId(Long userId);


}
