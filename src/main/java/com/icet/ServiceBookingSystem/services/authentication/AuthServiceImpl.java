package com.icet.ServiceBookingSystem.services.authentication;

import com.icet.ServiceBookingSystem.dto.SignupRequestDTO;
import com.icet.ServiceBookingSystem.dto.UserDto;
import com.icet.ServiceBookingSystem.entity.User;
import com.icet.ServiceBookingSystem.enums.UserRole;
import com.icet.ServiceBookingSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    public UserDto signupClient(SignupRequestDTO signupRequestDTO){
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastname(signupRequestDTO.getLastname());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }


}