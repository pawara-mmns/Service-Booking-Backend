package com.icet.ServiceBookingSystem.services.authentication;

import com.icet.ServiceBookingSystem.dto.SignupRequestDTO;
import com.icet.ServiceBookingSystem.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
