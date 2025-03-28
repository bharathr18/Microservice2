package com.project.address_service.service;

import com.project.address_service.entity.Address;
import com.project.address_service.response.AddressResponse;
import com.project.address_service.respository.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    ModelMapper modelMapper;

    public AddressResponse getAddressById(int employeeId)
    {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }
}
