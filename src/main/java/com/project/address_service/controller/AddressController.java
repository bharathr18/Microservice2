package com.project.address_service.controller;

import com.project.address_service.entity.Address;
import com.project.address_service.response.AddressResponse;
import com.project.address_service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/getAddress/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressById(@PathVariable("employeeId") int employeeId)
    {
        AddressResponse addressResponse = addressService.getAddressById(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
