
package com.jpa.practices.jpapractices.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.practices.jpapractices.Repository.AddressRepo;
import com.jpa.practices.jpapractices.Response.AddressResponse;
import com.jpa.practices.jpapractices.modal.address;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<address> addressByEmployeeId = addressRepo.findAddressByEmployeeeId(employeeId);
        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }

}
