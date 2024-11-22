package com.icet.ServiceBookingSystem.controller;


import com.icet.ServiceBookingSystem.dto.AdDTO;
import com.icet.ServiceBookingSystem.services.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/ad/{userId}")
    public ResponseEntity<?> postAd(@PathVariable Long userId, @ModelAttribute AdDTO adDTO) throws IOException {
        boolean success = companyService.postAd(userId, adDTO);
        if(success){
            return ResponseEntity.status(HttpStatus.OK).build();
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @GetMapping("/ads/{userId}")
    public ResponseEntity<?> getAllAdsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(companyService.getAllAds(userId));
    }
    @GetMapping("/ad/{adId}")
    public ResponseEntity<?> getAdById(@PathVariable long adId){
        AdDTO adDTO = companyService.getAdById(adId);
        if(adDTO != null){
            return ResponseEntity.ok(adDTO);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping("/ad/{adId}")
    public ResponseEntity<?> updateAd(@PathVariable long adId, @ModelAttribute AdDTO adDTO) throws IOException {
        boolean success = companyService.updateAd(adId, adDTO);
        if (success) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
    }
}
