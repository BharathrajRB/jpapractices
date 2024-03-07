package com.jpa.practices.jpapractices.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.practices.jpapractices.Repository.AddressRepository;
import com.jpa.practices.jpapractices.Response.AddressResponse;
import com.jpa.practices.jpapractices.modal.Address;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmpId(int empId) {
        Optional<Address> add = addressRepository.getAddressByEmpId(empId);
        AddressResponse resp = mapper.map(add, AddressResponse.class);
        return resp;
    }

}
